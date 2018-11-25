package com.example.gugubird.Dao;

import com.example.gugubird.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
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
}
