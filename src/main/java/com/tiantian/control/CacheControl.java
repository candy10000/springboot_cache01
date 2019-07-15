package com.tiantian.control;

import com.tiantian.entity.Person;
import com.tiantian.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CacheControl {

    @Autowired
    PersonService personService;


    //http://localhost:8080/query?id=4&name=yy&age=90&address=putian
    @RequestMapping("/put")
    @ResponseBody
    public Person put(Person person){
        return  personService.insert(person);

    }

    //http://localhost:8080/query?id=1
    @RequestMapping("/query")
    @ResponseBody
    public Person cacheable(Person person){
        Person person1 = personService.queryById(person);
        return person1;
    }








    //  @ResponseBody
    @RequestMapping(value = "/")
    public String test(){

        return "index";
    }

}
