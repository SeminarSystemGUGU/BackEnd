package com.example.gugubird.Controller;

import com.example.gugubird.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    /**
     * 新建课程
     * @param newCourse
     * @return
     */
    @PostMapping("/")
    public boolean createCourse(NewCourseDTO newCourse){
        return courseService.createCourse(newCourse);
    }

    /**
     * 获取学生所选的课程
     * @param courseId
     * @return
     */
   // public List<CourseEntity> getCourseOfStudent()
}
