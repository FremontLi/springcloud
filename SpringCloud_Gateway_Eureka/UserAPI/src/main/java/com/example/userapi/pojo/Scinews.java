package com.example.userapi.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scinews {
    private String id;
    private String title;
    private String type;
    private String user_id;
    private String link;
    private String cover;
    private Integer downloads;
    private Timestamp gmt_created;
    private String create_by;
    private Timestamp gmt_updated;
    private String update_by;
}
