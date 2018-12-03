package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.EditUserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface
UserMapper {
     void delete(String account);

     UserEntity findAccount(String account);

    /*获取所有学生信息*/
     List<UserEntity> getStudents();

    /*搜索用户账号*/
     List<UserEntity> searchUser(@Param("para") String para);

    /*删除用户*/
     boolean deleteUser(@Param("para") int para);

    /*重置密码*/
      boolean resetPassword(@Param("userId") int userId);

    /*编辑用户账号信息*/
     boolean editUser(EditUserDTO editUserDTO);

    @Select("select * from user where ACCOUNT=#{account} and PASSWORD=#{password}")
     UserEntity findByAccountAndPassword(@Param("account") String account,@Param("password") String password);

    /*获取当前班级下未组队学生信息*/
    List<UserEntity> notGroupStudent(int classId);

    /*获取所有教师账号*/
    List<UserEntity> getTeachers();

}
