package com.example.gugubird.Dao;

import com.example.gugubird.Mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseDao {
    @Autowired
    private CourseMapper courseMapper;

    /*�½��γ�*/
   // public boolean createCourse(NewCourseDTO newCourseDTO){
//        return courseMapper.createCourse(newCourseDTO);
//    }

}
