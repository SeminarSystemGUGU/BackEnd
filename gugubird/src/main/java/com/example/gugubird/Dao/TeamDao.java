package com.example.gugubird.Dao;

import com.example.gugubird.Entity.TeamEntity;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Mapper.TeamMapper;
import com.example.gugubird.Mapper.UserMapper;
import com.example.gugubird.Model.LoginVO;
import com.example.gugubird.Model.NewTeamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamDao {
    @Autowired

    private TeamMapper teamMapper;

    /*创建小组*/
    public boolean createTeam(NewTeamDTO newTeamDTO){
        return teamMapper.createTeam(newTeamDTO);
    }

    /*创建小组时写入student_class_team表中*/
    public boolean addTo_student_class_team(int studentId,int classId,int isLeader){
        return teamMapper.addTo_student_class_team(studentId,classId,isLeader);
    }

    /*获取当前班级下所有组队信息*/
    public List<TeamEntity> getTeams(int classId){
        return teamMapper.getTeams(classId);
    }

    /*获取当前班级下当前学生的组队信息*/
    public List<TeamEntity> getStudentTeam(int classId,int studentId){
        int teamId=teamMapper.teamIdOfStudent(classId,studentId);
        return teamMapper.getStudentTeam(classId,teamId);
    }

}
