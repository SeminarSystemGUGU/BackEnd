package com.example.gugubird.Dao;

import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Mapper.ClassMapper;
import com.example.gugubird.Mapper.CourseMapper;
import com.example.gugubird.Mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseDao {
    @Autowired
    private CourseMapper courseMapper;

    /*ÐÂ½¨¿Î³Ì*/
    public boolean createCourse(CourseEntity course){
        return courseMapper.createCourse(course);
    }

}
