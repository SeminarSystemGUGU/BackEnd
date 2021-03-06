package com.example.gugubird.Controller;

import com.example.gugubird.Entity.ClassEntity;
import com.example.gugubird.Entity.CourseEntity;
import com.example.gugubird.Model.*;
import com.example.gugubird.Service.CourseService;
import com.sun.javafx.geom.Vec2d;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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
        classEntity.setClassTime("周五七八节课");
        classEntity.setClassPosition("海韵教学楼301");
        List<ClassEntity> list=new ArrayList<ClassEntity>();
        list.add(classEntity);
        studentCourseVO.setClasses(list);
        List<StudentCourseVO> list1=new ArrayList<StudentCourseVO>();
        list1.add(studentCourseVO);

        StudentCourseVO studentCourseVO1=new StudentCourseVO();
        studentCourseVO1.setCourseId(2);
        studentCourseVO1.setCourseName("J2EE");
        ClassEntity classEntity1=new ClassEntity();
        classEntity1.setClassName("2016-1");
        classEntity1.setClassId(2);
        classEntity1.setClassPosition("海韵教学楼101");
        classEntity1.setClassTime("周三三四节课");
        List<ClassEntity> list2=new ArrayList<>();
        list2.add(classEntity1);
        studentCourseVO1.setClasses(list2);
        list1.add(studentCourseVO1);


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
        courseVO.setTeamStartTime(start);
        courseVO.setTeamEndTime(end);
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

    /**获取该课程下共享信息的课程
     * @param courseId
     * @return
     */
    @GetMapping("/{courseId}/shareCourse")
    public List<ShareCourseVO> getShareCourse(@PathVariable int courseId){
      ShareCourseVO shareCourseVO=new ShareCourseVO();
      shareCourseVO.setCourseName("J2EE");
      shareCourseVO.setTeacherName("邱明老师");
      shareCourseVO.setShareType("共享讨论课");
      shareCourseVO.setShareSituation(1);

      ShareCourseVO shareCourseVO1=new ShareCourseVO();
      shareCourseVO1.setCourseName("软件工程");
      shareCourseVO1.setTeacherName("王美红老师");
      shareCourseVO1.setShareType("共享分组");
      shareCourseVO1.setShareSituation(0);

      List<ShareCourseVO> list=new ArrayList<ShareCourseVO>();
      list.add(shareCourseVO);
      list.add(shareCourseVO1);
      return list;
    }

    @GetMapping("/{courseId}/round")
    public List<RoundVO> getRound(@PathVariable("courseId") String courseId)
    {
        List<RoundVO> list= new Vector<>();
        RoundVO roundVO=new RoundVO();
        roundVO.setRoundId(1);
        roundVO.setRoundName("第一轮");
        SeminarVO seminarVO=new SeminarVO();
        seminarVO.setReportEndTime("2018-12-29");
        seminarVO.setTime("2018-12-20 七八节课");
        seminarVO.setSeminarTopic("springboot详解");
        seminarVO.setSeminarContent("详细介绍springboot");
        seminarVO.setSeminarId(1);
        List<SeminarVO> seminarVOS=new Vector<>();
        seminarVOS.add(seminarVO);
        roundVO.setList(seminarVOS);
        list.add(roundVO);
        list.add(roundVO);
        return list;
    }

    @GetMapping("/{courseId}/roundSigned")
    public List<RoundVO> getRoundSigned(@PathVariable("courseId") String courseId)
    {
        List<RoundVO> list= new Vector<>();
        RoundVO roundVO=new RoundVO();
        roundVO.setRoundId(1);
        roundVO.setRoundName("第一轮");
        SeminarVO seminarVO=new SeminarVO();
        seminarVO.setReportEndTime("2018-12-29");
        seminarVO.setTime("2018-12-20 七八节课");
        seminarVO.setSeminarTopic("springboot详解");
        seminarVO.setSeminarContent("详细介绍springboot");
        seminarVO.setSeminarId(1);
        List<SeminarVO> seminarVOS=new Vector<>();
        seminarVOS.add(seminarVO);
        roundVO.setList(seminarVOS);
        RoundVO roundVO1=new RoundVO();
        roundVO1.setRoundName("第二轮");
        roundVO1.setRoundId(1);
        list.add(roundVO);
        list.add(roundVO1);
        return list;
    }


}
