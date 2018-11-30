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

    /*����С��*/
    public boolean createTeam(NewTeamDTO newTeamDTO);

    /*����С��ʱд��student_class_team����*/
    public boolean addTo_student_class_team(@Param("studentId")int studentId,@Param("classId")int classId,@Param("isTeamLeader") int isLeader);

    /*��ȡ��ǰ�༶�����������Ϣ*/
    public List<TeamEntity> getTeams(int classId);

    /*ɾ����ǰ�༶������С��*/
    public boolean deleteTeamInClass(int classId);


    /*��ȡ��ǰ�༶�µ�ǰѧ���������Ϣ*/
    public List<TeamEntity> getStudentTeam(int classId,int teamId);

    /*��ȡ��ǰѧ����Ӧ��teamId*/
    public int teamIdOfStudent(int classId,int studentId);

}
