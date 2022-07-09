package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.SpanCheckData;

public interface SpanCheckDataMapper {
    int deleteByPrimaryKey(Integer spanCheckDataId);

    int insert(SpanCheckData record);

    int insertSelective(SpanCheckData record);

    SpanCheckData selectByPrimaryKey(Integer spanCheckDataId);

    int updateByPrimaryKeySelective(SpanCheckData record);

    int updateByPrimaryKey(SpanCheckData record);

    List<SpanCheckData> selectAll();


}
