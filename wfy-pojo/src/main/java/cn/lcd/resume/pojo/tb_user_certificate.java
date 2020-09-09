package cn.lcd.resume.pojo;

import lombok.Data;
//用户证书关联表
@Data
public class tb_user_certificate {
    //资格证书id
    private Integer certificate_id;
    //用户id
    private Integer user_id;
}
