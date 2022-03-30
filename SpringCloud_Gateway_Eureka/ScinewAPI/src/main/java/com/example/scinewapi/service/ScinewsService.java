package com.example.scinewapi.service;

import com.example.scinewapi.mapper.ScinewsMapper;
import com.example.scinewapi.pojo.Scinews;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScinewsService {

    private final ScinewsMapper scinewsMapper;

    public ScinewsService(ScinewsMapper scinewsMapper){
        this.scinewsMapper = scinewsMapper;
    }

    public List<Scinews> findByUserId(String userId){
        return scinewsMapper.findByUserId(userId);
    }


}
