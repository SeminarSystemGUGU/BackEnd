package com.example.gugubird.Service;

import com.example.gugubird.Dao.ClassDao;
import com.example.gugubird.Dao.TeamDao;
import com.example.gugubird.Dao.UserDao;
import com.example.gugubird.Entity.TeamEntity;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.NewTeamDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassDao classDao;

    @Autowired
    private TeamDao teamDao;

    @Autowired
    private UserDao userDao;

    @Value("userId")
    String userIdName;


    public boolean deleteClass(int classId){
        return classDao.deleteClass(classId);
    }


    public boolean createTeam(HttpServletRequest httpServletRequest,int classId , NewTeamDTO newTeamDTO){
        newTeamDTO.setClassId(classId);
        Cookie[] cookies=httpServletRequest.getCookies();
        for(Cookie cookie:cookies){   //
            if(cookie.getName().equals(userIdName))
                newTeamDTO.setTeamLeaderId(Integer.parseInt(cookie.getValue()));
        }
        newTeamDTO.setMemberNumber(newTeamDTO.getStudentNumber()+1);  //

        if(!teamDao.createTeam(newTeamDTO))
            return false;
        if(!teamDao.addTo_student_class_team( newTeamDTO.getTeamLeaderId(), classId,1))
            return false;
        for(int i=0;i<newTeamDTO.getStudentNumber();i++){
            if(!teamDao.addTo_student_class_team(newTeamDTO.getStudentId().get(i),classId,0))
                return false;
        }
        return true;
    }

    public List<TeamEntity> getTeams(int classId){
        return teamDao.getTeams(classId);
    }

    public List<TeamEntity> getStudentTeam(int classId,HttpServletRequest httpServletRequest){
        Cookie[] cookies=httpServletRequest.getCookies();
        for(Cookie cookie:cookies)
            if(cookie.getName().equals(userIdName)){
                int studentId=Integer.parseInt(cookie.getValue());
                return teamDao.getStudentTeam(classId,studentId);
            }
        return null;
    }

    public List<UserEntity> notGroupStudent(int classId){
        return userDao.notGroupStudent(classId);
    }
}


