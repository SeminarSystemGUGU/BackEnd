package com.example.gugubird.Service;

import com.example.gugubird.Dao.UserDao;
import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.EditUserDTO;
import com.example.gugubird.Model.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;


    public List<UserEntity> getTeachers(){
        return userDao.getTeachers();
    }

    public List<UserEntity> getStudents(){
        return userDao.getStudents();
    }

    public boolean deleteUser(int para){
        return userDao.deleteUser(para);
    }

    public boolean resetPassword(int userId){
        return userDao.resetPassword(userId);
    }

    public boolean editUser(EditUserDTO editUserDTO){
        return userDao.editUser(editUserDTO);
    }

    public List<UserEntity> searchUser(String role,String para) {
        String tea="Teacher";
        String stu="Student";
        if ("".equals(para) && tea.equals(role)) {
            return userDao.getTeachers();
        }
        else if ("".equals(para) && stu.equals(role)) {
            return userDao.getStudents();
        }
        else {
            return userMapper.searchUser(para);
        }
    }

    public LoginVO login(String account, String password)
    {
        return userDao.login(account,password);
    }
}
