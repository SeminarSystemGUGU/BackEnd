package com.example.gugubird.Model;

import java.util.Date;

public class CourseVO {
    double PresentationProportion;
    double QuestionProportion;
    double ReportProportion;
    int minMember;
    int maxMember;
    Date teamStartTime;
    Date teamEndTime;

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
