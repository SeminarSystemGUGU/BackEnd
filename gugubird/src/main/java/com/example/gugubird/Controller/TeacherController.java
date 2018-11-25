package com.example.gugubird.Controller;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class
TeacherController {
    @Autowired
    AuthenticationManagerBuilder auth;

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getTeachers")
    @ResponseBody
    public List<UserEntity> getTeachers() {
        return teacherService.getTeachers();
    }

    @GetMapping("/searchTeacher")
    @ResponseBody
    public List<UserEntity> searchTeacher(HttpServletRequest request){
        String para=request.getParameter("teacherAccountOrName");
        return teacherService.searchTeacher(para);
    }



}
