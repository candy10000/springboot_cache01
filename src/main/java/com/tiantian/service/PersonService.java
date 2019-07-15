package com.tiantian.service;


import com.tiantian.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Person)表服务接口
 *
 * @author makejava
 * @since 2019-07-15 22:34:25
 */

public interface PersonService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Person queryById(Person person);


    /**
     * 新增数据
     *
     * @param person 实例对象
     * @return 实例对象
     */
    Person insert(Person person);

}