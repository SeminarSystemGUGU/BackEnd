package com.example.gugubird.Dao;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Model.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    @Autowired
    UserMapper userMapper;
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
}
