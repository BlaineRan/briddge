package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.Piers;

public interface PiersMapper {
    int deleteByPrimaryKey(Integer pierId);

    int insert(Piers record);

    int insertSelective(Piers record);

    Piers selectByPrimaryKey(Integer pierId);

    int updateByPrimaryKeySelective(Piers record);

    int updateByPrimaryKey(Piers record);

    List<Piers> selectAll();

    List<Piers> selectAllByBridgeId(@Param("bridgeId")Integer bridgeId);



}
