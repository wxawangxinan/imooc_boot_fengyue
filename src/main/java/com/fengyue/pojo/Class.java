package com.fengyue.pojo;

/**
* 
* @author wangxinan
* @date 2019-09-25
* 数据表boot_t_class_
*/
public class Class {
    /**
     * 班级id
	* 列名:id_ 类型:VARCHAR(32) 允许空:false 缺省值:null
     */
    private String id;

    /**
     * 班级名称
	* 列名:name_ 类型:VARCHAR(30) 允许空:true 缺省值:null
     */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}