package com.fengyue.twomapper;

import com.fengyue.pojo.Two;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TwoMapper {
    int deleteByPrimaryKey(String id);

    int insert(Two record);

    int insertSelective(Two record);

    Two selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Two record);

    int updateByPrimaryKey(Two record);
}