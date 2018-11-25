package com.example.gugubird.Service;

import com.example.gugubird.Dao.UserMapper;
import com.example.gugubird.Entity.User;
import com.example.gugubird.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService{

    @Autowired
    private UserMapper userMapper;


    public List<UserEntity> getTeachers(){
        return userMapper.getTeachers();
    }

   public List<UserEntity> searchTeacher(String para){
        return userMapper.searchTeacher(para);
   }
}


