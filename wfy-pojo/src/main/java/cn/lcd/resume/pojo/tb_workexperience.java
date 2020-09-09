package cn.lcd.resume.pojo;

import lombok.Data;

import java.util.Date;

//工作经历表
@Data
public class tb_workexperience {

    //工作经历id
    private Integer workexperience_id;
    //公司名称
    private String workexperience_company;
    //所在行业
    private String workexperience_industry;
    //在职开始时间
    private Date workexperience_workingtimebegin;
    //在职结束时间
    private Date workexperience_workingtimeend;
    //职位类型
    private String workexperience_type;
    //所属部门
    private String workexperience_department;
    //工作内容
    private String workexperience_content;
    //工作业绩
    private String workexperience_performance;
}
