package com.example.userapi.service;


import com.alibaba.fastjson.JSON;
import com.example.userapi.mapper.UserMapper;
import com.example.userapi.midclass.CrossSelrct;
import com.example.userapi.pojo.Scinews;
import com.example.userapi.pojo.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Configuration
public class UserService {

    private final UserMapper userMapper;
    private RestTemplate restTemplate;

    UserService(UserMapper userMapper,RestTemplate restTemplate) {
        this.userMapper = userMapper;
        this.restTemplate = restTemplate;
    }

    public List<User> getUsersById(String id){
        return this.userMapper.findByUserId(id);
    }

    public List<Scinews> getScinewsFromOtherMicroServiceById(String id){
        String newsList = restTemplate.getForObject("http://scinewapi/getscinewbyid/"+id,String.class);
        return JSON.parseArray(newsList, Scinews.class);  // TODO
    }

    public CrossSelrct getAllinfoById(String id){
        List<Scinews> newss = this.getScinewsFromOtherMicroServiceById(id);
        return new CrossSelrct(this.getUsersById(id),newss);
    }
}
