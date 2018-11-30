package com.example.gugubird.Controller;

import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Model.NewCourseDTO;
import com.example.gugubird.Model.NewCourseVO;
import com.example.gugubird.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    /**
     * �½��γ�,�����½��γ̵�id
     * @param newCourse
     * @return
     */
    @PostMapping("/")
    public NewCourseVO createCourse(HttpServletRequest httpServletRequest, @RequestBody NewCourseDTO newCourse){
        return courseService.createCourse(httpServletRequest,newCourse);
    }

    /**
     * ��ȡѧ����ѡ�Ŀγ�
     * @param httpServletRequest
     * @return
     */
    @GetMapping("/studentCourse")
    public List<CourseEntity> getCourseOfStudent(HttpServletRequest httpServletRequest){
        return courseService.getCourseOfStudent(httpServletRequest);
    }
}
