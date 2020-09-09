package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import service.EmailService;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Hz
 * 2020/9/9
 */
@Service
public class EmailServiceImpl implements EmailService {
    @Value("${spring.mail.username}")
    private String MAIL_SENDER;
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    RedisTemplate redisTemplate;
    @Override
    public String sendEmail(String email) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(MAIL_SENDER);
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("等你来直聘");
//随机四位数
        String s = String.format("%04d", new Random().nextInt(9999));
        int valicode = Integer.parseInt(s);
        simpleMailMessage.setText("尊敬的用户你好，欢迎使用等你来直聘，本次操作验证码为" + valicode + "请勿将验证码泄露给他人！！");
        try {
            javaMailSender.send(simpleMailMessage);
            redisTemplate.opsForValue().set(email, valicode);
            redisTemplate.expire(email, 5, TimeUnit.MINUTES);
            return "发送成功";
        } catch (MailException e) {
            e.printStackTrace();
            return "发送失败";
        }
    }
}
