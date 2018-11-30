package com.example.gugubird.Service;

import com.example.gugubird.Dao.ClassDao;
import com.example.gugubird.Dao.TeamDao;
import com.example.gugubird.Dao.UserDao;
import com.example.gugubird.Entity.TeamEntity;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.NewTeamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassDao classDao;

    @Autowired
    private TeamDao teamDao;

    @Autowired
    private UserDao userDao;


    /*ɾ����ǰ�༶*/
    public boolean deleteClass(int classId){
        return classDao.deleteClass(classId);
    }

    /*�ڵ�ǰ�༶�´���С��*/
    public boolean createTeam(int classId ,NewTeamDTO newTeamDTO){
        newTeamDTO.setClassId(classId);
        return teamDao.createTeam(newTeamDTO);
    }

    /*��ȡ��ǰ�༶�����������Ϣ*/
    public List<TeamEntity> getTeams(int classId){
        return teamDao.getTeams(classId);
    }

    /*��ȡ��ǰ�༶�µ�ǰѧ���������Ϣ*/
    public List<TeamEntity> getStudentTeam(int classId,int studentId){
        return teamDao.getStudentTeam(classId,studentId);
    }

    /*��ȡ��ǰ�༶��δ��ӵ�ѧ����Ϣ*/
    public List<UserEntity> notGroupStudent(int classId){
        return userDao.notGroupStudent(classId);
    }
}


