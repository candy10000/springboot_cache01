package com.tiantian.dao;


import com.tiantian.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (Person)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-15 22:09:34
 */
@Mapper
public interface PersonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */

    @Select("select * from person where id = #{id}")
    Person queryById(Integer id);


    /**
     * 新增数据
     *
     * @param person 实例对象
     * @return 影响行数
     */
    @Insert("insert  into Person(id, name, age, address) value (#{id},#{name},#{age},#{address});")
    int insert(Person person);

}