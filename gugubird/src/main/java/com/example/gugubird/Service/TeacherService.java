package com.example.gugubird.Service;

import com.example.gugubird.Dao.TeacherDao;
import com.example.gugubird.Dao.UserDao;
import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.NewTeacherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TeacherDao teacherDao;

    @Value("${cookie.userId.name}")
    String userIdName;

    public List<UserEntity> getTeachers() {
        return userMapper.getTeachers();
    }

    /**
     * 获取老师的个人信息
     *
     * @param httpServletRequest
     * @return
     */
    public UserEntity getTeacherInfo(HttpServletRequest httpServletRequest) {
        String userId = "";
        Cookie[] cookies = httpServletRequest.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals(userIdName)) {
                userId = cookies[i].getValue();
            }
        }
        return teacherDao.getTeacherInfo(Integer.parseInt(userId));
    }

    /**
     * 新建教师信息
     * @param newTeacherDTO
     * @return
     */
    public boolean newTeacher(NewTeacherDTO newTeacherDTO)
    {
        try{
            teacherDao.newTeacher(newTeacherDTO);
        }catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
        return true;
    }
}


