package com.ran.dao;
import com.ran.controller.bridge.BridgeItem;
import org.apache.ibatis.annotations.Param;

import com.ran.domain.Bridge;

import java.util.List;

public interface BridgeMapper {
    int deleteByPrimaryKey(Integer bridgeId);

    int insert(Bridge record);

    int insertSelective(Bridge record);

    Bridge selectByPrimaryKey(Integer bridgeId);

    int updateByPrimaryKeySelective(Bridge record);

    int updateByPrimaryKey(Bridge record);

    List<Bridge> selectAll();

	List<Bridge> selectAllPaging(@Param("rowNum") Integer rowNum, @Param("pageSize") Integer pageSize, @Param("bridgeItem") BridgeItem bridgeItem);

    Integer countConditional(@Param("bridgeItem") BridgeItem bridgeItem);

    Integer countAll();

    Integer selectMaxPrimaryKey();
}
