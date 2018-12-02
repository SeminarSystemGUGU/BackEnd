package com.example.gugubird.Service;

import com.example.gugubird.Mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;
    @Test
    public void loginTest()
    {
        System.out.println(userService.login("12","12").getUserId());
    }

    @Test
    public void testCache()
    {
        System.out.println(userMapper.searchUser("12").get(0).getPassword());
        userMapper.resetPassword(12,"12");
        System.out.println(userMapper.searchUser("12").get(0).getPassword());
    }

    @Test
    public void searchTest()
    {
        System.out.println(userMapper.searchUser("ÇñÐ¡Ã÷").get(0).getName());
    }
}
