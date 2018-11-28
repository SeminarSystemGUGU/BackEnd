package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.UserEntity;
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

     List<UserEntity> getTeachers();

     List<UserEntity> getStudents();

     List<UserEntity> searchUser(@Param("para") String para);

     boolean deleteUser(@Param("para") int para);

      boolean resetPassword(@Param("userId") int userId);

     boolean editUser(@Param("id") int id,@Param("userName") String userName,@Param("userAccount") String userAccount,@Param("userEmail") String userEmail);

    @Select("select * from user where ACCOUNT=#{arg0} and PASSWORD=#{arg1}")
     UserEntity findByAccountAndPassword(String account,String password);
}
