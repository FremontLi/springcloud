package com.example.scinewapi.controller;

import com.alibaba.fastjson.JSON;
import com.example.scinewapi.service.ScinewsService;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    private final ScinewsService scinewsService;

    public Controller(ScinewsService scinewsService){
        this.scinewsService = scinewsService;
    }

    @GetMapping("/getscinewbyid/{id}")
    public String getScinewsById(@PathVariable String id){
        return JSON.toJSONString(scinewsService.findByUserId(id));
    }

}
