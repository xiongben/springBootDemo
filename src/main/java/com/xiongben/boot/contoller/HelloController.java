package com.xiongben.boot.contoller;


import com.oracle.tools.packager.Log;
import com.xiongben.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String handleo1(){
        Log.info("请求进来了");
        System.out.println("========");
        return "hello xiongben,2021!";
    }

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
