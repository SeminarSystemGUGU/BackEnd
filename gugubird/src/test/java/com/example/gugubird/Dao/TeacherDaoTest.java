package com.example.gugubird.Dao;

import com.example.gugubird.Model.NewTeacherDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherDaoTest {
    @Autowired
    TeacherDao teacherDao;
    @Test
    public void testGetTeacherInfo()
    {
        System.out.println(teacherDao.getTeacherInfo(12).getName());
    }

    @Test
    public void testNewTeacher()
    {
        NewTeacherDTO newTeacherDTO=new NewTeacherDTO();
        newTeacherDTO.setAccount("987");
        newTeacherDTO.setEmail("dsjafkka@qq.com");
        newTeacherDTO.setName("Œ‚”∆");
        newTeacherDTO.setPassword("dkasfjka");
        teacherDao.newTeacher(newTeacherDTO);
    }
}
