package com.example.gugubird.Controller;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    AuthenticationManagerBuilder auth;

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    @ResponseBody
    public List<UserEntity> getStudents(){
        return studentService.getStudents();
    }
}
