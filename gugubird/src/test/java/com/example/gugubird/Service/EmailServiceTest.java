package com.example.gugubird.Service;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailServiceTest {
    public void test(HttpServletResponse response)
    {
        Cookie cookie=new Cookie("dskf","66");
        response.addCookie(cookie);
    }
}
