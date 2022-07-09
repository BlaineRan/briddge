package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.DailyCheckRecord;

public interface DailyCheckRecordMapper {
    int deleteByPrimaryKey(Integer dailyCheckId);

    int insert(DailyCheckRecord record);

    int insertSelective(DailyCheckRecord record);

    DailyCheckRecord selectByPrimaryKey(Integer dailyCheckId);

    int updateByPrimaryKeySelective(DailyCheckRecord record);

    int updateByPrimaryKey(DailyCheckRecord record);

    List<DailyCheckRecord> selectAllByBridgeId(@Param("bridgeId")Integer bridgeId,@Param("current")Integer current,@Param("pageSize")Integer pageSize);

    int countByBridgeId(@Param("bridgeId")Integer bridgeId);

    int countMaxRecordId();
}
