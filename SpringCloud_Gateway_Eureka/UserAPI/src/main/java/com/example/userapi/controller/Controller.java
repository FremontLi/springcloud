package com.example.userapi.controller;

import com.alibaba.fastjson.JSON;
import com.example.userapi.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    private final UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getallbyid/{id}")
    @ResponseBody
    public String getAllInfoById(@PathVariable String id){
        return JSON.toJSONString(userService.getAllinfoById(id));
    }

}
