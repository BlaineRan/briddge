package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.SuperstructureElement;

public interface SuperstructureElementMapper {
    int deleteByPrimaryKey(Integer elementId);

    int insert(SuperstructureElement record);

    int insertSelective(SuperstructureElement record);

    SuperstructureElement selectByPrimaryKey(Integer elementId);

    int updateByPrimaryKeySelective(SuperstructureElement record);

    int updateByPrimaryKey(SuperstructureElement record);

    List<SuperstructureElement> selectAll();


}
