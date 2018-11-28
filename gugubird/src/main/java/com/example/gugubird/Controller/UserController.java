package com.example.gugubird.Controller;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.LoginVO;
import com.example.gugubird.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    AuthenticationManagerBuilder auth;

    @Autowired
    UserService userService;

    @GetMapping("/searchUser")
    public List<UserEntity> searchUser(String role,String accountOrName){
        return userService.searchUser(role,accountOrName);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(String userId){
        int Id=Integer.parseInt(userId);
        return userService.deleteUser(Id);
    }

    @PutMapping("/resetPassword")
    public boolean resetPassword(String userId){
        int id=Integer.parseInt(userId);
        return userService.resetPassword(id);
    }

    @PutMapping("/editUser")
    public boolean editUser(String userId,String userName,String userAccount,String userEmail){
        int id=Integer.parseInt(userId);
        return userService.editUser(id,userName,userAccount,userEmail);
    }

    /**
     * 用户登录
     * @param password
     * @param account
     * @return
     */
    @PostMapping("/user/{account}/login")
    public LoginVO login(@RequestBody String password, @RequestParam String account)
    {
        return userService.login(account,password);
    }
}
