package com.tiantian.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CacheControl {

  //  @ResponseBody
    @RequestMapping(value = "/")
    public String test(){

        return "index";
    }

}
