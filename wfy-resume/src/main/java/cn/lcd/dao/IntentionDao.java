package cn.lcd.dao;

import cn.lcd.resume.pojo.Intention;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IntentionDao {
    List<Intention> findResuemByUserName(Integer uesr_id);
}
