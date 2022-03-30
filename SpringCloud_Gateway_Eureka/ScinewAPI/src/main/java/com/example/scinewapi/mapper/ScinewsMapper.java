package com.example.scinewapi.mapper;


import com.example.scinewapi.pojo.Scinews;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ScinewsMapper {

    @Select("select * from learning1.sci_news where id = #{user_id}")
    List<Scinews> findByUserId(String user_id);

}
