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

    /*��ȡ����ѧ����Ϣ*/
     List<UserEntity> getStudents();

    /*�����û��˺�*/
     List<UserEntity> searchUser(@Param("para") String para);

    /*ɾ���û�*/
     boolean deleteUser(@Param("para") int para);

    /*��������*/
      boolean resetPassword(@Param("userId") int userId);

    /*�༭�û��˺���Ϣ*/
     boolean editUser(@Param("id") int id,@Param("userName") String userName,@Param("userAccount") String userAccount,@Param("userEmail") String userEmail);

    @Select("select * from user where ACCOUNT=#{arg0} and PASSWORD=#{arg1}")
     UserEntity findByAccountAndPassword(String account,String password);

    /*��ȡ��ǰ�༶��δ���ѧ����Ϣ*/
    List<UserEntity> notGroupStudent(int classId);

    /*��ȡ���н�ʦ�˺�*/
    List<UserEntity> getTeachers();
}
