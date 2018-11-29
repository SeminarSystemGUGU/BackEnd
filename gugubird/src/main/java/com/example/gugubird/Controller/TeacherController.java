package com.example.gugubird.Controller;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.NewTeacherDTO;
import com.example.gugubird.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
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
    private TeacherService teacherService;

    //这里和约定好的jpa样式好像不太一致
    @GetMapping("/getTeachers")
    @ResponseBody
    public List<UserEntity> getTeachers() {
        return teacherService.getTeachers();
    }

    /**
     * 获取老师信息
     * @return
     */
    @GetMapping("teacherInfo")
    public UserEntity getTeacherInfo(HttpServletRequest httpServletRequest)
    {
        return teacherService.getTeacherInfo(httpServletRequest);
    }

    /**
     * 新建教师信息
     * @param newTeacherDTO
     * @return
     */
    @PostMapping("/")
    public boolean newTeacher(@RequestBody NewTeacherDTO newTeacherDTO)
    {
        return teacherService.newTeacher(newTeacherDTO);
    }

}
