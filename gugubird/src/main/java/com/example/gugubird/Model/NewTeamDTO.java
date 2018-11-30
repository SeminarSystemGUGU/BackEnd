package com.example.gugubird.Model;

import java.util.List;

public class NewTeamDTO {
  //  List<Integer> studentId;
    int studentId;
    String teamName;
    int memberNumber;
    int teamLeaderId;
    int classId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

//    public List<Integer> getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(List<Integer> studentId) {
//        this.studentId = studentId;
//    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getTeamLeaderId() {
        return teamLeaderId;
    }

    public void setTeamLeaderId(int teamLeaderId) {
        this.teamLeaderId = teamLeaderId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
