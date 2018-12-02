package com.example.gugubird.Controller;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.EditUserDTO;
import com.example.gugubird.Model.LoginVO;
import com.example.gugubird.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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
    public List<UserEntity> searchUser( String role, String accountOrName){
        return userService.searchUser(role,accountOrName);
    }


    /**
     * 删除账户
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    public boolean deleteUser(@PathVariable String userId){
        int Id=Integer.parseInt(userId);
        return userService.deleteUser(Id);
    }


    /**
     * 用户重置密码
     * @param userId
     * @return
     */
    @PutMapping("/{userId}/password")
    public boolean resetPassword(@PathVariable int userId){
        return userService.resetPassword(userId);
    }


    /**
     * 编辑用户账号信息
     * @param userId
     * @param editUserDTO
     * @return
     */
    @PutMapping("/{userId}/userInfomation")
    public boolean editUser(@PathVariable("userId") int userId, @RequestBody EditUserDTO editUserDTO){
        editUserDTO.setUserId(userId);
        return  userService.editUser(editUserDTO);
    }

    /**
     * 用户登录
     * @param
     * @param account
     * @return
     */
    @PostMapping("/{account}/login")
    public LoginVO login(@RequestBody Map<String,String> map, @PathVariable("account") String account)
    {
        System.out.println(map.get("password"));
        return userService.login(account,map.get("password"));
    }

}
