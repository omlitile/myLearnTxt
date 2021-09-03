package com.example.modelstudy.mytest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aopController")
public class TestController {


    @RequestMapping(value = "sayHello",method = RequestMethod.GET)
    public String testController(String name){
      return "hello  "+name;
    }
}
