package com.yqp.serviceimpl;

import com.yqp.api.UserService;

public class UserServiceImpl implements UserService {

    public String say(String word) {
        return "hello" + word;
    }
}
