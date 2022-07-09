package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.SuperstructureCheckItems;

public interface SuperstructureCheckItemsMapper {
    int deleteByPrimaryKey(Integer checkItemId);

    int insert(SuperstructureCheckItems record);

    int insertSelective(SuperstructureCheckItems record);

    SuperstructureCheckItems selectByPrimaryKey(Integer checkItemId);

    int updateByPrimaryKeySelective(SuperstructureCheckItems record);

    int updateByPrimaryKey(SuperstructureCheckItems record);

    List<SuperstructureCheckItems> selectAll();


}
