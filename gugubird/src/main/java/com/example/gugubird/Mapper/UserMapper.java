package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface
UserMapper {
    public void delete(String account);

    public UserEntity findAccount(String account);

    public List<UserEntity> getTeachers();

    public List<UserEntity> getStudents();

    public List<UserEntity> searchUser(@Param("para") String para);

    public boolean deleteUser(@Param("para") int para);

    public  boolean resetPassword(@Param("userId") int userId);

    public boolean editUser(@Param("id") int id,@Param("userName") String userName,@Param("userAccount") String userAccount,@Param("userEmail") String userEmail);
}
