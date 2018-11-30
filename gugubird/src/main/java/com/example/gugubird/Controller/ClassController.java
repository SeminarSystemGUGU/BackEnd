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
    @DeleteMapping("/{classId}")
   public boolean deleteClass(@PathVariable int classId){
       return classService.deleteClass(classId);
    }

    /**
     * 在当前班级下新建小组
     * @param newTeamDTO
     * @return
     */
    @PostMapping("/{classId}/team")
    public boolean createTeam(@PathVariable("classId") int classId,@RequestBody NewTeamDTO newTeamDTO){
        return classService.createTeam(classId,newTeamDTO);
    }


    /**
     * 获取当前班级下所有组队信息
     * @param classId
     * @return
     */
    @GetMapping("/{classId}/team")
    public List<TeamEntity> getTeams(@PathVariable int classId){
        return classService.getTeams(classId);
    }

    /** 获取当前班级下当前学生的组队信息
     * @param classId
     * @param studentId
     */
    @GetMapping("/{classId}/studentTeam")
    public List<TeamEntity> getStudentTeam(@PathVariable int classId,@RequestParam int studentId){
        return classService.getStudentTeam(classId,studentId);
    }


    /** 获取当前班级下未组队的学生信息
     * @param classId
     */
    @GetMapping("/{classId}/student/notGroupStudent")
    public List<UserEntity> notGroupStudent(@PathVariable int classId){
        return classService.notGroupStudent(classId);
    }

}
