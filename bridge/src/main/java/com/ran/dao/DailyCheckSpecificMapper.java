package com.ran.dao;
import java.util.List;

import com.ran.domain.DailyCheckSpecific;
import org.apache.ibatis.annotations.Param;

public interface DailyCheckSpecificMapper {
    int deleteByPrimaryKey(@Param("specificId") Integer specificId, @Param("dailyCheckId") Integer dailyCheckId);

    int insert(DailyCheckSpecific record);

    int insertSelective(DailyCheckSpecific record);

    DailyCheckSpecific selectByPrimaryKey(@Param("specificId") Integer specificId, @Param("dailyCheckId") Integer dailyCheckId);

    int updateByPrimaryKeySelective(DailyCheckSpecific record);

    int updateByPrimaryKey(DailyCheckSpecific record);

    List<DailyCheckSpecific> selectAllByDailyCheckId(@Param("dailyCheckId")Integer dailyCheckId);

    int countMaxPrimaryKey();
}
