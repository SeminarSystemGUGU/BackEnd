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
        userService.login("12","12");
    }

    @Test
    public void searchTest()
    {
        System.out.println(userMapper.searchUser("��С��").get(0).getName());
    }
}