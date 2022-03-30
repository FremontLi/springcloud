package com.example.userapi.midclass;



import com.example.userapi.pojo.Scinews;
import com.example.userapi.pojo.User;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class CrossSelrct {
    public User user;
    public List<Scinews> newsList;

    public CrossSelrct(List<User> user, List<Scinews> newsList){
        this.user = user.get(0);
        this.newsList = newsList;
    }
}
