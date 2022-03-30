package com.example.userapi.mapper;

import com.example.userapi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserMapper {
    @Select("select * from learning.sys_user where id = #{id}")
    List<User> findByUserId(String id);
}
