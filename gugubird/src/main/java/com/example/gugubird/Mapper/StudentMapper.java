package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    @Select("select * from user where USERID=#{arg0} AND ROLE='Student'")
    UserEntity findStudentByUserId(int UserId);
}
