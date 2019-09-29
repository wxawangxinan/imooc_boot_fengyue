package com.fengyue.threemapper;

import com.fengyue.pojo.Class;
import java.util.List;

public interface ClassMapper {
    /**
	* 
	* @author wangxinan
	* @date 2019-09-25
	* @param id
	* @return int
	*/
    int deleteByPrimaryKey(String id);

    /**
	* 
	* @author wangxinan
	* @date 2019-09-25
	* @param record
	* @return int
	*/
    int insert(Class record);

    /**
	* 
	* @author wangxinan
	* @date 2019-09-25
	* @param id
	* @return com.fengyue.pojo.Class
	*/
    Class selectByPrimaryKey(String id);

    /**
	* 
	* @author wangxinan
	* @date 2019-09-25
	* @return java.util.List<com.fengyue.pojo.Class>
	*/
    List<Class> selectAll();

    /**
	* 
	* @author wangxinan
	* @date 2019-09-25
	* @param record
	* @return int
	*/
    int updateByPrimaryKey(Class record);
}