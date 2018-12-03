package com.example.gugubird.Service;

import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Entity.User;
import com.example.gugubird.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author ren
 */
@Service
public class UserSecurityServiceImpl implements UserDetailsService{
    @Autowired
    UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        System.out.println(account);
        UserEntity users =userMapper.findAccount(account);
        if(users == null) {
            throw new UsernameNotFoundException("User not found for name:"+account);
        }
        return new User(users.getAccount(),users.getPassword(),"ROLE_"+users.getRole());
    }
}
