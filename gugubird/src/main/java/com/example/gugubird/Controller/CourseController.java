package com.example.gugubird.Controller;

import com.example.gugubird.Entity.ClassEntity;
import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Model.NewCourseDTO;
import com.example.gugubird.Model.NewCourseVO;
import com.example.gugubird.Model.StudentCourseVO;
import com.example.gugubird.Model.TeacherCourseVO;
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

    /**创建课程
     *
     * @param newCourse
     * @return
     */
    @PostMapping("")
    public NewCourseVO createCourse(HttpServletRequest httpServletRequest, @RequestBody NewCourseDTO newCourse){
        return courseService.createCourse(httpServletRequest,newCourse);
    }

    /**获取学生所选的课程
     *
     * @param httpServletRequest
     * @return
     */
    @GetMapping("/studentCourse")
    public List<StudentCourseVO> getCourseOfStudent(HttpServletRequest httpServletRequest){
        StudentCourseVO studentCourseVO=null;
        studentCourseVO.setCourseId(1);
        studentCourseVO.setCourseName("OOAD");
        ClassEntity classEntity=null;
        classEntity.setClassId(1);
        classEntity.setClassName("2016-1");
        List<ClassEntity> list=null;
        list.add(classEntity);
        studentCourseVO.setClasses(list);

        List<StudentCourseVO> list1=null;
        list1.add(studentCourseVO);
        return list1;
        //return courseService.getCourseOfStudent(httpServletRequest);
    }

    /**
     *教师教授的课程
     * @param httpServletRequest
     * @return
     */
    @GetMapping("/teacherCourse")
    public List<TeacherCourseVO> getTeacherCourse(HttpServletRequest httpServletRequest){
        TeacherCourseVO teacherCourseVO=null;
        teacherCourseVO.setCourseId(1);
        teacherCourseVO.setCourseName("OOAD");
        teacherCourseVO.setStatus(1);

        TeacherCourseVO teacherCourseVO1=null;
        teacherCourseVO1.setCourseId(2);
        teacherCourseVO1.setCourseName("J2EE");
        teacherCourseVO1.setStatus(0);

        List<TeacherCourseVO> list=null;
        list.add(teacherCourseVO);
        list.add(teacherCourseVO1);
        return list;
    }


    /**获取当前课程信息
     *
     */
//    @GetMapping("/{courseId}")
//    public

}
