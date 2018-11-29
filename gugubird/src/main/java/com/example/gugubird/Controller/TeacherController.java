package com.example.gugubird.Controller;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class
TeacherController {
    @Autowired
    AuthenticationManagerBuilder auth;

    @Autowired
    private UserService userService;


    /**
     * 获取所有教师账号
     * @return
     */
    @GetMapping("/")
    public List<UserEntity> getTeachers() {
        return userService.getTeachers();
    }

}
