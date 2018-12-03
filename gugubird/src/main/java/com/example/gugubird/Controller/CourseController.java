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
import java.util.ArrayList;
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
        StudentCourseVO studentCourseVO=new StudentCourseVO();
        studentCourseVO.setCourseId(1);
        studentCourseVO.setCourseName("OOAD");
        ClassEntity classEntity=new ClassEntity();
        classEntity.setClassId(1);
        classEntity.setClassName("2016-1");
        List<ClassEntity> list=new ArrayList<ClassEntity>();
        list.add(classEntity);
        studentCourseVO.setClasses(list);

        List<StudentCourseVO> list1=new ArrayList<StudentCourseVO>();
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
        TeacherCourseVO teacherCourseVO=new TeacherCourseVO();
        teacherCourseVO.setCourseId(1);
        teacherCourseVO.setCourseName("OOAD");
        teacherCourseVO.setStatus(1);

        TeacherCourseVO teacherCourseVO1=new TeacherCourseVO();
        teacherCourseVO1.setCourseId(2);
        teacherCourseVO1.setCourseName("J2EE");
        teacherCourseVO1.setStatus(0);

        List<TeacherCourseVO> list=new ArrayList<TeacherCourseVO>();
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
        CourseVO courseVO=new CourseVO();
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


    /**获取当前课程下所有班级信息
     * @param courseId
     */
    @GetMapping("/{courseId}/class")
    public List<ClassVO> allClassedInCourse(@PathVariable int courseId){
        ClassVO classVO=new ClassVO();
        classVO.setClassName("2016级1班");
        classVO.setSeminarTime("周三78节");
        classVO.setSeminatPosition("海韵301");
        classVO.setFileName("周三78节.xlsx");

        ClassVO classVO1=new ClassVO();
        classVO1.setClassName("2016级2班");
        classVO1.setSeminarTime("周三56节");
        classVO1.setSeminatPosition("公寓306");
        classVO1.setFileName("周三56节.xlsx");

        List<ClassVO> list=new ArrayList<ClassVO>();
        list.add(classVO);
        list.add(classVO1);
        return list;
    }

}
