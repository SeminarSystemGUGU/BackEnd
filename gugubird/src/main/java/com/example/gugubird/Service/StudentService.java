package com.example.gugubird.Service;

import com.example.gugubird.Mapper.StudentMapper;
import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    StudentMapper studentMapper;
    
    @Value("${cookie.userId.name}")
    String userIdName;

    public List<UserEntity> getStudents(){
        return userMapper.getStudents();
    }

    public UserEntity getStudentInfo(HttpServletRequest httpServletRequest)
    {
        String userId="";
        Cookie[] cookies=httpServletRequest.getCookies();
        for(int i=0;i<cookies.length;i++)
        {
            if(cookies[i].getName().equals(userIdName))
            {
                userId=cookies[i].getValue();
                break;
            }
        }
        return studentMapper.findStudentByUserId(Integer.parseInt(userId));
    }
}
