package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.TeamEntity;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.NewTeamDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface
TeamMapper {

    /*创建小组*/
    public boolean createTeam(NewTeamDTO newTeamDTO);

    /*创建小组时写入student_class_team表中*/
    public boolean addTo_student_class_team(@Param("studentId")int studentId,@Param("classId")int classId,@Param("isTeamLeader") int isLeader);

    /*获取当前班级下所有组队信息*/
    public List<TeamEntity> getTeams(int classId);

    /*删除当前班级下所有小组*/
    public boolean deleteTeamInClass(int classId);


    /*获取当前班级下当前学生的组队信息*/
    public List<TeamEntity> getStudentTeam(int classId,int teamId);

    /*获取当前学生对应的teamId*/
    public int teamIdOfStudent(int classId,int studentId);

}
