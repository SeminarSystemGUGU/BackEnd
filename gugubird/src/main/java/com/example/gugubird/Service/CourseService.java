package com.example.gugubird.Service;

import com.example.gugubird.Dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    /*�����γ�*/
//    public boolean createCourse(NewCourseDTO newCourseDTO){
//        return courseDao.createCourse(newCourseDTO);
//    }

}


