package cn.lcd.resume.pojo;

import lombok.Data;

//用户工作经历关联表
@Data
public class tb_user_workexperience {
    //工作经历id
    private Integer workexperience_id;
    //用户id
    private String user_id;
}
