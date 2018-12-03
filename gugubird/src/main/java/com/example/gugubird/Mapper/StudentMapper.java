package com.example.gugubird.Mapper;

import com.example.gugubird.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author ren
 */
@Mapper
@Repository
public interface StudentMapper {
    /**
     *
     * @param userId
     * @return
     */
    @Select("select * from user where USERID=#{arg0} AND ROLE='Student'")
    UserEntity findStudentByUserId(int userId);
}
