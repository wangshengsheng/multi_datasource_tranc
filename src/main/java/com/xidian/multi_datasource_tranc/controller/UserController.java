package com.xidian.multi_datasource_tranc.controller;


import com.xidian.multi_datasource_tranc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("/insert03")
    public int insert03(String name, Integer age){
        return  userService.insert3(name,age);
    }


}
