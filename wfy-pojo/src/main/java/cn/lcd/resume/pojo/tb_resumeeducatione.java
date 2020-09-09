package cn.lcd.resume.pojo;


import lombok.Data;

import java.util.Date;

//教育经历
@Data
public class tb_resumeeducatione {

    //教育经历id
    private int resumeeducatione_id;

    //学校
    private String resumeeducatione_school;

    //学历
    private String resumeeducatione_background;

    //专业
    private String resumeeducatione_major;

    //结束时间
    private Date resumeeducatione_lasttime;

    //开始时间
    private Date resumeeducatione_beforetime;

    //在校经历
    private String resumeeducatione_experience;

}
