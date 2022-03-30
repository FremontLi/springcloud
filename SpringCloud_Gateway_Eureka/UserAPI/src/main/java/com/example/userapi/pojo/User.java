package com.example.userapi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String nickname;
    private String phone;
    private String email;
    private String password;
    private String salt;
    private Timestamp gmt_create;
    private Timestamp gmt_update;
}
