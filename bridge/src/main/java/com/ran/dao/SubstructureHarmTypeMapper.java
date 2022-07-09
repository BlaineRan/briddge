package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.SubstructureHarmType;

public interface SubstructureHarmTypeMapper {
    int deleteByPrimaryKey(Integer harmTypeId);

    int insert(SubstructureHarmType record);

    int insertSelective(SubstructureHarmType record);

    SubstructureHarmType selectByPrimaryKey(Integer harmTypeId);

    int updateByPrimaryKeySelective(SubstructureHarmType record);

    int updateByPrimaryKey(SubstructureHarmType record);

    List<SubstructureHarmType> selectAll();

    List<SubstructureHarmType> selectHarmTypeByBridgeTypeId(int bridgeTypeId);
}
