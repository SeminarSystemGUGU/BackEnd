package com.example.gugubird.Controller;

import com.example.gugubird.Entity.TeamEntity;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.NewTeamDTO;
import com.example.gugubird.Service.ClassService;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    /**
     * 删除班级(只删除到team)
     * @param classId
     * @return
     */
    @DeleteMapping("/class/{classid}")
   public boolean deleteClass(int classId){
       return classService.deleteClass(classId);
    }

    /**
     * 在当前班级下新建小组
     * @param teamEntity
     * @return
     */
    @PostMapping("/class/{classId}/team")
    public boolean createTeam(NewTeamDTO newTeamDTO){
        return classService.createTeam(newTeamDTO);
    }


    /**
     * 获取当前班级下所有组队信息
     * @param classId
     * @return
     */
    @GetMapping("/class/{classId}/team")
    public List<TeamEntity> getTeams(int classId){
        return classService.getTeams(classId);
    }

    /** 获取当前班级下当前学生的组队信息
     * @param classId
     * @param studentId
     */
    @GetMapping("/class/{classId}/studentTeam")
    public List<TeamEntity> getStudentTeam(int classId,int studentId){
        return classService.getStudentTeam(classId,studentId);
    }


    /** 获取当前班级下未组队的学生信息
     * @param classId
     */
    @GetMapping("/class/{classId}/student/notGroupStudent")
    public List<UserEntity> notGroupStudent(int classId){
        return classService.notGroupStudent(classId);
    }

}
