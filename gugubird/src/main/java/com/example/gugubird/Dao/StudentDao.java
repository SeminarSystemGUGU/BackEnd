package com.example.gugubird.Dao;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
    @Autowired
    StudentMapper studentMapper;
    public UserEntity getStudentInfo(int userId)
    {
        return studentMapper.findStudentByUserId(userId);
    }
}
