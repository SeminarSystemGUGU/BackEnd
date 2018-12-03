package com.example.gugubird.Service;

import com.example.gugubird.Dao.CourseDao;
import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Model.NewCourseDTO;
import com.example.gugubird.Model.NewCourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    @Value("UserId")
    String userIdName;

    public NewCourseVO createCourse(HttpServletRequest httpServletRequest, NewCourseDTO newCourseDTO){
        Cookie[] cookies=httpServletRequest.getCookies();
        for(Cookie cookie:cookies) {
            if (cookie.getName().equals(userIdName)) {
                newCourseDTO.setTeacherId(Integer.parseInt(cookie.getValue()));
            }
        }
        return courseDao.createCourse(newCourseDTO);
    }

    public List<CourseEntity> getCourseOfStudent(HttpServletRequest httpServletRequest){
        int studentId;
        Cookie[] cookies=httpServletRequest.getCookies();
        for(Cookie cookie:cookies) {
            if (cookie.getName().equals(userIdName)) {
                studentId = Integer.parseInt(cookie.getValue());
                return courseDao.getCourseOfStudent(studentId);
            }
        }
        return null;
    }

}


