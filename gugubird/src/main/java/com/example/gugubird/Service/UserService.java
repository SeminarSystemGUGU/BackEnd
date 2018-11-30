package com.example.gugubird.Service;

import com.example.gugubird.Dao.UserDao;
import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Entity.UserEntity;
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


    /*��ȡ���н�ʦ�˺�*/
    public List<UserEntity> getTeachers(){
        return userDao.getTeachers();
    }

    /*��ȡ����ѧ���˺�*/
    public List<UserEntity> getStudents(){
        return userDao.getStudents();
    }

    /*ɾ���û�*/
    public boolean deleteUser(int para){
        return userMapper.deleteUser(para);
    }

    /*��������*/
    public boolean resetPassword(int userId){
        return userMapper.resetPassword(userId);
    }

    /*�༭�û���Ϣ*/
    public boolean editUser(int id,String userName,String userAccount,String userEmail){
        return userMapper.editUser(id,userName,userAccount,userEmail);
    }

    /*�����û�*/
    public List<UserEntity> searchUser(String role,String para) {
        if (para.equals("") && role.equals("Teacher"))
            return userDao.getTeachers();
        else if (para.equals("") && role.equals("Student"))
            return userDao.getStudents();
        else
            return userMapper.searchUser(para);
    }

    public LoginVO login(String account, String password)
    {
        return userDao.login(account,password);
    }
}
