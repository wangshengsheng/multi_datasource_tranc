package com.xidian.multi_datasource_tranc.mapper01;


import com.xidian.multi_datasource_tranc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper01 {
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    public User findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    public int insert(@Param("name") String name, @Param("age") Integer age);
}

