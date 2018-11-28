package com.example.gugubird.Service;

import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService{

    @Autowired
    private UserMapper userMapper;


    public List<UserEntity> getTeachers(){
        return userMapper.getTeachers();
    }
}


