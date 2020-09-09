package cn.lcd.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IntentionDao {
    List findResuemByUserName(Integer uesr_id);
}
