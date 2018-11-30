package com.example.gugubird.Controller;

import com.example.gugubird.Entity.TeamEntity;
import com.example.gugubird.Entity.UserEntity;
import com.example.gugubird.Model.NewTeamDTO;
import com.example.gugubird.Service.ClassService;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    /**
     * ɾ���༶(ֻɾ����team)
     * @param classId
     * @return
     */
    @DeleteMapping("/{classId}")
   public boolean deleteClass(@PathVariable int classId){
       return classService.deleteClass(classId);
    }

    /**
     * �ڵ�ǰ�༶���½�С��(����δͨ��)
     * @param newTeamDTO
     * @return
     */
    @PostMapping("/{classId}/team")
    public boolean createTeam(HttpServletRequest httpServletRequest,@PathVariable("classId") int classId, @RequestBody NewTeamDTO newTeamDTO){
        return classService.createTeam(httpServletRequest,classId,newTeamDTO);
    }


    /**
     * ��ȡ��ǰ�༶�����������Ϣ
     * @param classId
     * @return
     */
    @GetMapping("/{classId}/team")
    public List<TeamEntity> getTeams(@PathVariable int classId){
        return classService.getTeams(classId);
    }


    /** ��ȡ��ǰ�༶�µ�ǰѧ���������Ϣ
     * @param classId
     * @param httpServletRequest
     * @return
     */
    @GetMapping("/{classId}/studentTeam")
    public List<TeamEntity> getStudentTeam(@PathVariable int classId,HttpServletRequest httpServletRequest){
        return classService.getStudentTeam(classId,httpServletRequest);
    }


    /** ��ȡ��ǰ�༶��δ��ӵ�ѧ����Ϣ
     * @param classId
     * @return
     */
    @GetMapping("/{classId}/student/notGroupStudent")
    public List<UserEntity> notGroupStudent(@PathVariable int classId){
        return classService.notGroupStudent(classId);
    }


    /**�ڵ�ǰ�༶���½�֪ͨ
     * @param
     * @return
     */
    //@PostMapping("/{classId}/notice")
    //public boolean newNotice(){

    //}
}
