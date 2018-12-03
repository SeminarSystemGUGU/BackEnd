package com.example.gugubird.Mapper;


import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.NewTeacherDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TeacherMapper {
    @Select("select * from user where USERID=#{arg0} AND ROLE='Teacher'")
    UserEntity findTeacherByUserId(int userId);

   void newTeacher(NewTeacherDTO newTeacherDTO);
}
