package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Model.NewCourseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {

    /*�½��γ�*/
    public int createCourse(NewCourseDTO newCourseDTO);

    /*��ȡ��ǰѧ����ѡ�γ�*/
    public List<CourseEntity> getCourseOfStudent(int studentId);
}
