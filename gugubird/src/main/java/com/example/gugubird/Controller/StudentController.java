package com.example.gugubird.Controller;

import com.example.gugubird.Entity.User;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Service.StudentService;
import com.example.gugubird.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    AuthenticationManagerBuilder auth;

    @Autowired
    private UserService userService;
    @Autowired
    private StudentService studentService;


    /**
     * 获取所有学生账号
     * @return
     */
    @GetMapping("/")
    public List<UserEntity> getStudents(){
        return userService.getStudents();
    }

     @GetMapping("studentInfo")
    public UserEntity getStudentInfo(HttpServletRequest httpServletRequest)
     {
         return studentService.getStudentInfo(httpServletRequest);
     }
}
