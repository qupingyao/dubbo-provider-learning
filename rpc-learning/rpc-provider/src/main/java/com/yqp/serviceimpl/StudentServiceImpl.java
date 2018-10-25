package com.yqp.serviceimpl;

import com.yqp.api.StudentService;

public class StudentServiceImpl implements StudentService {

    public int count(int num) {
        return num + 1;
    }
}
