package cn.lcd.resume.pojo;

import lombok.Data;
//求职意向表
@Data
public class tb_intention {

    //求职意向id
    private int intention_id;
    //求职状态
    private String intention_status;
    //期望职位
    private String intention_position;
    //期望行业
    private String intention_business;
    //工作城市
    private String intention_city;
    //薪资要求
    private String intention_personally;
}
