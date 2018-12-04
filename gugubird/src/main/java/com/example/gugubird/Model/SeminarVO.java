package com.example.gugubird.Model;

public class SeminarVO {
    Integer seminarId;
    String seminarContent;
    String seminarTopic;
    String time;
    String reportEndTime;
    int seminarOrder;
    String status;
    String pptEndTime;
    String signStartTime;
    String signEndTime;
    //报名 未报名  未开始  进行中  结束


    public String getSignEndTime() {
        return signEndTime;
    }

    public String getSignStartTime() {
        return signStartTime;
    }

    public void setSignEndTime(String signEndTime) {
        this.signEndTime = signEndTime;
    }

    public void setSignStartTime(String signStartTime) {
        this.signStartTime = signStartTime;
    }

    public String getPptEndTime() {
        return pptEndTime;
    }

    public void setPptEndTime(String pptEndTime) {
        this.pptEndTime = pptEndTime;
    }

    public int getSeminarOrder() {
        return seminarOrder;
    }

    public void setSeminarOrder(int seminarOrder) {
        this.seminarOrder = seminarOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSeminarId() {
        return seminarId;
    }

    public void setSeminarId(Integer seminarId) {
        this.seminarId = seminarId;
    }

    public String getSeminarContent() {
        return seminarContent;
    }

    public void setSeminarContent(String seminarContent) {
        this.seminarContent = seminarContent;
    }

    public String getSeminarTopic() {
        return seminarTopic;
    }

    public void setSeminarTopic(String seminarTopic) {
        this.seminarTopic = seminarTopic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReportEndTime() {
        return reportEndTime;
    }

    public void setReportEndTime(String reportEndTime) {
        this.reportEndTime = reportEndTime;
    }
}
