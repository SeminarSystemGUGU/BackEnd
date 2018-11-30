package com.example.gugubird.Entity;

import java.util.Date;

public class CourseEntity {

    private int CourseId;
    private String CourseName;
    private String CourseIntroduction;
    private int TeacherId;
    private float PresentationProportion;
    private float QuestionProportion;
    private float ReportProportion;
    private Date TeamStartTime;
    private Date TeamEndTime;
    private int TeamMinMember;
    private int TeamMaxMember;
    private int ShareTeamStatus;
    private int ShareSeminarStatus;

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseIntroduction() {
        return CourseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        CourseIntroduction = courseIntroduction;
    }

    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int teacherId) {
        TeacherId = teacherId;
    }

    public float getPresentationProportion() {
        return PresentationProportion;
    }

    public void setPresentationProportion(float presentationProportion) {
        this.PresentationProportion = presentationProportion;
    }

    public float getQuestionProportion() {
        return QuestionProportion;
    }

    public void setQuestionProportion(float questionProportion) {
        QuestionProportion = questionProportion;
    }

    public float getReportProportion() {
        return ReportProportion;
    }

    public void setReportProportion(float reportProportion) {
        ReportProportion = reportProportion;
    }

    public Date getTeamStartTime() {
        return TeamStartTime;
    }

    public void setTeamStartTime(Date teamStartTime) {
        TeamStartTime = teamStartTime;
    }

    public Date getTeamEndTime() {
        return TeamEndTime;
    }

    public void setTeamEndTime(Date teamEndTime) {
        TeamEndTime = teamEndTime;
    }

    public int getTeamMinMember() {
        return TeamMinMember;
    }

    public void setTeamMinMember(int teamMinMember) {
        TeamMinMember = teamMinMember;
    }

    public int getTeamMaxMember() {
        return TeamMaxMember;
    }

    public void setTeamMaxMember(int teamMaxMember) {
        TeamMaxMember = teamMaxMember;
    }

    public int getShareTeamStatus() {
        return ShareTeamStatus;
    }

    public void setShareTeamStatus(int shareTeamStatus) {
        ShareTeamStatus = shareTeamStatus;
    }

    public int getShareSeminarStatus() {
        return ShareSeminarStatus;
    }

    public void setShareSeminarStatus(int shareSeminarStatus) {
        ShareSeminarStatus = shareSeminarStatus;
    }
}
