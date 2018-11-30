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

    /*����С��*/
    public boolean createTeam(NewTeamDTO newTeamDTO){
        return teamMapper.createTeam(newTeamDTO);
    }

    /*����С��ʱд��student_class_team����*/
    public boolean addTo_student_class_team(int studentId,int classId,int isLeader){
        return teamMapper.addTo_student_class_team(studentId,classId,isLeader);
    }

    /*��ȡ��ǰ�༶�����������Ϣ*/
    public List<TeamEntity> getTeams(int classId){
        return teamMapper.getTeams(classId);
    }

    /*��ȡ��ǰ�༶�µ�ǰѧ���������Ϣ*/
    public List<TeamEntity> getStudentTeam(int classId,int studentId){
        int teamId=teamMapper.teamIdOfStudent(classId,studentId);
        return teamMapper.getStudentTeam(classId,teamId);
    }

}
