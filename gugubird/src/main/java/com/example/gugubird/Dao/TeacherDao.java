package com.example.gugubird.Dao;


import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Mapper.TeacherMapper;
import com.example.gugubird.Model.NewTeacherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherDao {
    @Autowired
    TeacherMapper teacherMapper;
    /**
     * 获取教师信息
     * @param userId
     * @return
     */
    public UserEntity getTeacherInfo(int userId)
    {
        return teacherMapper.findTeacherByUserId(userId);
    }

    /**
     * 新建教师记录
     */
    public void newTeacher(NewTeacherDTO newTeacherDTO)
    {
        teacherMapper.newTeacher(newTeacherDTO);
    }
}
