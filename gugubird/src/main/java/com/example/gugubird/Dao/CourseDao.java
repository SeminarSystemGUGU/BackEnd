package com.example.gugubird.Dao;

import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Mapper.CourseMapper;
import com.example.gugubird.Model.NewCourseDTO;
import com.example.gugubird.Model.NewCourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseDao {
    @Autowired
    private CourseMapper courseMapper;

    public NewCourseVO createCourse(NewCourseDTO newCourseDTO){
        NewCourseVO newCourseVO=new NewCourseVO();
        newCourseVO.setCourseId(-1);
        newCourseVO.setCourseId(courseMapper.createCourse(newCourseDTO));
        if(newCourseVO.getCourseId()!=-1)
            newCourseVO.setSuccess(true);
        else
            newCourseVO.setSuccess(false);
        return newCourseVO;
    }


    /*��ȡ��ǰѧ����ѡ�γ�*/
    public List<CourseEntity> getCourseOfStudent(int studentId){
        return courseMapper.getCourseOfStudent(studentId);
    }

}
