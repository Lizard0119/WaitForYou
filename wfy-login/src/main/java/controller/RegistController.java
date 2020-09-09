package controller;
import service.EmailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Hz
 * 2020/9/9
 */
@RestController
@RequestMapping("/regist")
public class RegistController {
    @Resource
    private EmailService emailservice;

    @RequestMapping("/sendEmail")
    public String sendEmail(@RequestParam("mail") String email){
        return emailservice.sendEmail(email);
    }
}
