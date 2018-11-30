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

    /*��ȡ����ѧ����Ϣ*/
     List<UserEntity> getStudents();

    /*�����û��˺�*/
     List<UserEntity> searchUser(@Param("para") String para);

    /*ɾ���û�*/
     boolean deleteUser(@Param("para") int para);

    /*��������*/
      boolean resetPassword(@Param("userId") int userId);

    /*�༭�û��˺���Ϣ*/
     boolean editUser(EditUserDTO editUserDTO);

    @Select("select * from user where ACCOUNT=#{account} and PASSWORD=#{password}")
     UserEntity findByAccountAndPassword(@Param("account") String account,@Param("password") String password);

    /*��ȡ��ǰ�༶��δ���ѧ����Ϣ*/
    List<UserEntity> notGroupStudent(int classId);

    /*��ȡ���н�ʦ�˺�*/
    List<UserEntity> getTeachers();

}
