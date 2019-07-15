package com.tiantian.service;

import com.tiantian.dao.PersonDao;
import com.tiantian.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements PersonService{

    @Autowired
    PersonDao personDao;


    @Override
    @Cacheable(value = "people",key = "#person.id")
    public Person queryById(Person person) {
       person = personDao.queryById(person.getId());
        System.out.println("id:"+person.getId()+"数据做了缓存");
        return person;
    }

    @Override
    @CachePut(value = "people",key = "#person.id")
    public Person insert(Person person) {
        personDao.insert(person);
        System.out.println("id:"+person.getId()+"数据做了缓存");
        return person;
    }
}
