package com.example.gugubird.Model;

import java.util.Date;

public class NewCourseDTO {
    String courseName;
    String courseContent;
    float presentationProportion;
    float questionProportion;
    float reportProportion;
    int maxTeamMember;
    int minTeamMember;
    Date teamStartTime;
    Date teamEndTime;
    int teacherId;


    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }

    public float getPresentationProportion() {
        return presentationProportion;
    }

    public void setPresentationProportion(float presentationProportion) {
        this.presentationProportion = presentationProportion;
    }

    public float getQuestionProportion() {
        return questionProportion;
    }

    public void setQuestionProportion(float questionProportion) {
        this.questionProportion = questionProportion;
    }

    public float getReportProportion() {
        return reportProportion;
    }

    public void setReportProportion(float reportProportion) {
        this.reportProportion = reportProportion;
    }

    public int getMaxTeamMember() {
        return maxTeamMember;
    }

    public void setMaxTeamMember(int maxTeamMember) {
        this.maxTeamMember = maxTeamMember;
    }

    public int getMinTeamMember() {
        return minTeamMember;
    }

    public void setMinTeamMember(int minTeamMember) {
        this.minTeamMember = minTeamMember;
    }

    public Date getTeamStartTime() {
        return teamStartTime;
    }

    public void setTeamStartTime(Date teamStartTime) {
        this.teamStartTime = teamStartTime;
    }

    public Date getTeamEndTime() {
        return teamEndTime;
    }

    public void setTeamEndTime(Date teamEndTime) {
        this.teamEndTime = teamEndTime;
    }
}
