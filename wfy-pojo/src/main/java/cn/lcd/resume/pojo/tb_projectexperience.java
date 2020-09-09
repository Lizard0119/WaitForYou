package cn.lcd.resume.pojo;


import lombok.Data;

import java.util.Date;

//项目经验
@Data
public class tb_projectexperience {

    //项目经验id
    private int projectexperience_id;
    //项目名称
    private String projectexperience_name;
    //项目角色
    private String projectexperience_role;
    //项目开始时间
    private Date projectexperience_lasttime;
    //项目结束时间
    private Date projectexperience_beforetime;
    //项目描述
    private String projectexperience_describe;
    //项目业绩
    private String projectexperience_performance;
    //项目链接
    private String projectexperience_connect;

}
