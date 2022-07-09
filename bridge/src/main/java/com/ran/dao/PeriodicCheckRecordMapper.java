package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.PeriodicCheckRecord;

public interface PeriodicCheckRecordMapper {
    int deleteByPrimaryKey(Integer periodicCheckId);

    int insert(PeriodicCheckRecord record);

    int insertSelective(PeriodicCheckRecord record);

    PeriodicCheckRecord selectByPrimaryKey(Integer periodicCheckId);

    int updateByPrimaryKeySelective(PeriodicCheckRecord record);

    int updateByPrimaryKey(PeriodicCheckRecord record);

    List<PeriodicCheckRecord> selectAll();

    List<PeriodicCheckRecord> selectAllByBridgeId(@Param("bridgeId")Integer bridgeId, @Param("current")Integer current,@Param("pageSize") Integer pageSize);

    Integer countByBridgeId(@Param("bridgeId")Integer bridgeId);

    int selectMaxPrimaryKey();
}
