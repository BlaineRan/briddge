package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.Spans;

public interface SpansMapper {
    int deleteByPrimaryKey(Integer spanId);

    int insert(Spans record);

    int insertSelective(Spans record);

    Spans selectByPrimaryKey(Integer spanId);

    int updateByPrimaryKeySelective(Spans record);

    int updateByPrimaryKey(Spans record);

    List<Spans> selectAll();

    List<Spans> selectAllByBridgeId(@Param("bridgeId")Integer bridgeId);



}
