package com.example.gugubird.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CourseVO {
    double PresentationProportion;
    double QuestionProportion;
    double ReportProportion;
    int minMember;
    int maxMember;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss a" , locale="zh" , timezone="GMT+8")
    String  teamStartTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss a" , locale="zh" , timezone="GMT+8")
    String teamEndTime;

    public double getPresentationProportion() {
        return PresentationProportion;
    }

    public void setPresentationProportion(double presentationProportion) {
        PresentationProportion = presentationProportion;
    }

    public double getQuestionProportion() {
        return QuestionProportion;
    }

    public void setQuestionProportion(double questionProportion) {
        QuestionProportion = questionProportion;
    }

    public double getReportProportion() {
        return ReportProportion;
    }

    public void setReportProportion(double reportProportion) {
        ReportProportion = reportProportion;
    }

    public int getMinMember() {
        return minMember;
    }

    public void setMinMember(int minMember) {
        this.minMember = minMember;
    }

    public int getMaxMember() {
        return maxMember;
    }

    public void setMaxMember(int maxMember) {
        this.maxMember = maxMember;
    }

    public String  getTeamStartTime() {
        return teamStartTime;
    }

    public void setTeamStartTime(String  teamStartTime) {
        this.teamStartTime = teamStartTime;
    }

    public String getTeamEndTime() {
        return teamEndTime;
    }

    public void setTeamEndTime(String  teamEndTime) {
        this.teamEndTime = teamEndTime;
    }
}
