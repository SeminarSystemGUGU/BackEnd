package com.example.gugubird.Service;

import com.example.gugubird.Dao.UserMapper;
import com.example.gugubird.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> getStudents(){
        return userMapper.getStudents();
    }

    public List<UserEntity>  searchStudent(String para){
        return userMapper.searchStudent(para);
    }
}
