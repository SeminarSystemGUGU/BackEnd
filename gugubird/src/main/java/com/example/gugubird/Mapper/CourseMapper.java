package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Model.NewCourseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {

    /*新建课程*/
    public int createCourse(NewCourseDTO newCourseDTO);

    /*获取当前学生所选课程*/
    public List<CourseEntity> getCourseOfStudent(int studentId);
}
