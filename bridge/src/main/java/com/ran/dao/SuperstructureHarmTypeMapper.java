package com.ran.dao;
import com.ran.controller.bridgeCheck.SuperstructureHarmTypeItem;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.SuperstructureHarmType;

public interface SuperstructureHarmTypeMapper {
    int deleteByPrimaryKey(Integer harmTypeId);

    int insert(SuperstructureHarmType record);

    int insertSelective(SuperstructureHarmType record);

    SuperstructureHarmType selectByPrimaryKey(Integer harmTypeId);

    int updateByPrimaryKeySelective(SuperstructureHarmType record);

    int updateByPrimaryKey(SuperstructureHarmType record);

    List<SuperstructureHarmType> selectAll();

    List<SuperstructureHarmTypeItem> selectHarmTypeByBridgeTypeId(int bridgeTypeId);
}
