package com.openapi.openapi.services;

import com.openapi.openapi.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public User createUser(User u){
        User user = new User();
        user.setUserName(u.getUserName());
        user.setPassWord(u.getPassWord());
        return user;
    }

    public List<User> findAll(){
        User u1 = new User();
        User u2 = new User();
        u1.setUserName("user1");
        u1.setPassWord("pass1");
        u2.setUserName("user2");
        u2.setPassWord("pass2");
        List<User> users= List.of(u1,u2);

        return users;
    }
}
