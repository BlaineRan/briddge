package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.SubstructureElement;

public interface SubstructureElementMapper {
    int deleteByPrimaryKey(Integer elementId);

    int insert(SubstructureElement record);

    int insertSelective(SubstructureElement record);

    SubstructureElement selectByPrimaryKey(Integer elementId);

    int updateByPrimaryKeySelective(SubstructureElement record);

    int updateByPrimaryKey(SubstructureElement record);

    List<SubstructureElement> selectAll();


}
