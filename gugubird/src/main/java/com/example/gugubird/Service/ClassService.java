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


    /*删除当前班级*/
    public boolean deleteClass(int classId){
        return classDao.deleteClass(classId);
    }

    /*在当前班级下创建小组*/
    public boolean createTeam(int classId ,NewTeamDTO newTeamDTO){
        newTeamDTO.setClassId(classId);
        return teamDao.createTeam(newTeamDTO);
    }

    /*获取当前班级下所有组队信息*/
    public List<TeamEntity> getTeams(int classId){
        return teamDao.getTeams(classId);
    }

    /*获取当前班级下当前学生的组队信息*/
    public List<TeamEntity> getStudentTeam(int classId,int studentId){
        return teamDao.getStudentTeam(classId,studentId);
    }

    /*获取当前班级下未组队的学生信息*/
    public List<UserEntity> notGroupStudent(int classId){
        return userDao.notGroupStudent(classId);
    }
}


