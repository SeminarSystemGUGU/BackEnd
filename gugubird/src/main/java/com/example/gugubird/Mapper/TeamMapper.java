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


    public boolean createTeam(NewTeamDTO newTeamDTO);


    public boolean addTo_student_class_team(@Param("studentId")int studentId,@Param("classId")int classId,@Param("isTeamLeader") int isLeader);


    public List<TeamEntity> getTeams(int classId);


    public boolean deleteTeamInClass(int classId);


    public List<TeamEntity> getStudentTeam(int classId,int teamId);

    public int teamIdOfStudent(int classId,int studentId);

}
