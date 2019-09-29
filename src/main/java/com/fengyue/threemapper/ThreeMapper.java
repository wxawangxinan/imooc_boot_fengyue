package com.fengyue.threemapper;

import com.fengyue.pojo.Three;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ThreeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Three record);

    int insertSelective(Three record);

    Three selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Three record);

    int updateByPrimaryKey(Three record);
}