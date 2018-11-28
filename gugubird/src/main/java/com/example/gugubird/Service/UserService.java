package com.example.gugubird.Service;

import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> searchUser(String role,String para){
        if(para.equals("")&&role.equals("Teacher"))
            return userMapper.getTeachers();
        else if(para.equals("")&&role.equals("Student"))
            return userMapper.getStudents();
        else
            return userMapper.searchUser(para);
    }

    public boolean deleteUser(int para){
        return userMapper.deleteUser(para);
    }

    public boolean resetPassword(int userId){
        return userMapper.resetPassword(userId);
    }

    public boolean editUser(int id,String userName,String userAccount,String userEmail){
        return userMapper.editUser(id,userName,userAccount,userEmail);
    }
}
