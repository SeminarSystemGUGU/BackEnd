package com.example.gugubird.Dao;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Model.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {
    @Autowired
    UserMapper userMapper;

    /**
     * 鐢ㄦ埛鐧诲綍
     * @param account
     * @param password
     * @return
     */
    public LoginVO login(String account, String password)
    {
        LoginVO loginVO=new LoginVO();
        UserEntity userEntity=userMapper.findByAccountAndPassword(account,password);
        if(userEntity==null)
            loginVO.setSuccess(false);
        else
        {
            loginVO.setSuccess(true);
            loginVO.setUserId(userEntity.getUserId());
        }
        return loginVO;

    }


    public List<UserEntity> getTeachers(){
        return userMapper.getTeachers();
    }

    public List<UserEntity> getStudents(){
        return userMapper.getStudents();
    }

    public List<UserEntity> searchUser(String para){
        return userMapper.searchUser(para);
    };

    public boolean deleteUser(int para){
        return userMapper.deleteUser(para);
    };

    public boolean resetPassword(int userId){
        return userMapper.resetPassword(userId);
    };

    boolean editUser(int id,String userName,String userAccount,String userEmail){
        return userMapper.editUser(id,userName,userAccount,userEmail);
    };

    /*获取当前班级下未组队学生信息*/
    public List<UserEntity> notGroupStudent(int classId){
        return userMapper.notGroupStudent(classId);
    };

}
