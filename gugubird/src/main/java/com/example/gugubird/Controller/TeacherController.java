package com.example.gugubird.Controller;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gugubird.Model.NewTeacherDTO;
import com.example.gugubird.Service.TeacherService;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class
TeacherController {
    @Autowired
    AuthenticationManagerBuilder auth;

    @Autowired
    private UserService userService;
    @Autowired
    TeacherService teacherService;


    /**
     * 获取所有教师账号
     * @return
     */
    @GetMapping("")
    public List<UserEntity> getTeachers() {
        return userService.getTeachers();
    }

    /**
     * 获取教师信息
     * @return
     */
    @GetMapping("/teacherInfo")
    public UserEntity getTeacherInfo(HttpServletRequest httpServletRequest)
    {
        return teacherService.getTeacherInfo(httpServletRequest);
    }

    /**
     * 创建教师账号
     * @param newTeacherDTO
     * @return
     */
    @PostMapping("")
    public boolean newTeacher(@RequestBody NewTeacherDTO newTeacherDTO)
    {
        return teacherService.newTeacher(newTeacherDTO);
    }

}
