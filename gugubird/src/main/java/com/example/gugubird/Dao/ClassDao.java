package com.example.gugubird.Dao;

import com.example.gugubird.Mapper.ClassMapper;
import com.example.gugubird.Mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassDao {
    @Autowired
    private ClassMapper classMapper;

    @Autowired
    private TeamMapper teamMapper;


    /*É¾³ý°à¼¶*/
    public boolean deleteClass(int classId){

        if(classMapper.deleteClass(classId)==true&&teamMapper.deleteTeamInClass(classId)==true)
            return true;
        else
            return false;
    }

}
