package com.example.gugubird.Entity;

import java.util.Date;

public class CourseEntity {

    private int courseId;
    private String courseName;
    private String courseIntroduction;
    private int teacherId;
    private float presentationProportion;
    private float questionProportion;
    private float reportProportion;
    private Date teamStartTime;
    private Date teamEndTime;
    private int teamMinMember;
    private int teamMaxMember;
    private int shareTeamStatus;
    private int shareSeminarStatus;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    public int getTeamMinMember() {
        return teamMinMember;
    }

    public void setTeamMinMember(int teamMinMember) {
        this.teamMinMember = teamMinMember;
    }

    public int getTeamMaxMember() {
        return teamMaxMember;
    }

    public void setTeamMaxMember(int teamMaxMember) {
        this.teamMaxMember = teamMaxMember;
    }

    public int getShareTeamStatus() {
        return shareTeamStatus;
    }

    public void setShareTeamStatus(int shareTeamStatus) {
        this.shareTeamStatus = shareTeamStatus;
    }

    public int getShareSeminarStatus() {
        return shareSeminarStatus;
    }

    public void setShareSeminarStatus(int shareSeminarStatus) {
        this.shareSeminarStatus = shareSeminarStatus;
    }
}
