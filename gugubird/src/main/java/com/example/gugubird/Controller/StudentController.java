package com.example.gugubird.Controller;

import com.example.gugubird.Entity.User;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Service.StudentService;
import com.example.gugubird.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
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
     *
     * @return
     */
    @GetMapping("")
    public List<UserEntity> getStudents(){
        return userService.getStudents();
    }


     @GetMapping("studentInfo")
    public UserEntity getStudentInfo(HttpServletRequest httpServletRequest)
     {
         UserEntity userEntity=new UserEntity();
         userEntity.setAccount("123");
         userEntity.setUserId(123);
         userEntity.setStatus(0);
         userEntity.setRole("Student");
         userEntity.setName("任天翔大朋友");
         userEntity.setEmail("qwe1138318433@qq.com");
         return userEntity;
     }


}
