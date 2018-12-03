package com.example.gugubird.Controller;

import com.example.gugubird.Entity.ClassEntity;
import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Model.*;
import com.example.gugubird.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
     * @param courseId
     */
    @GetMapping("/{courseId}")
    public CourseVO nowCourseInfo(@PathVariable int courseId) throws ParseException {
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        CourseVO courseVO=null;
        courseVO.setPresentationProportion(0.5);
        courseVO.setQuestionProportion(0.2);
        courseVO.setReportProportion(0.3);
        courseVO.setMinMember(3);
        courseVO.setMaxMember(6);
        String start="2018-10-11";
        String end="2018-10-18";
        courseVO.setTeamStartTime(format1.parse(start));
        courseVO.setTeamEndTime(format1.parse(end));
        return courseVO;
    }

}
