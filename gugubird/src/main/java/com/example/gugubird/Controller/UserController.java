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


    /**
     * 搜索用户
     * @param role
     * @param accountOrName
     * @return
     */
    @GetMapping("/searchUser")
    public List<UserEntity> searchUser(String role,String accountOrName){
        return userService.searchUser(role,accountOrName);
    }


    /**
     * 删除账户
     * @param userId
     * @return
     */
    @DeleteMapping("/")
    public boolean deleteUser(String userId){
        int Id=Integer.parseInt(userId);
        return userService.deleteUser(Id);
    }

    /**
     * 用户重置密码
     * @param userId
     * @return
     */
    @PutMapping("/password")
    public boolean resetPassword(String userId){
        int id=Integer.parseInt(userId);
        return userService.resetPassword(id);
    }


    /**
     * 编辑用户账号信息
     * @param userId
     * @param userName
     * @param userAccount
     * @param userEmail
     * @return
     */
    @PutMapping("/studentInfomation")
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
