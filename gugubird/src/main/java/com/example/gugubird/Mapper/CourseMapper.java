package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.CourseEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CourseMapper {

    /*�½��γ�*/
    public boolean createCourse(CourseEntity course);
}
