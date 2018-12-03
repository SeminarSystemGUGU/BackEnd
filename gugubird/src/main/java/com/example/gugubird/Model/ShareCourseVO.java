package com.example.gugubird.Model;

public class ShareCourseVO {
  String courseName;
  String teacherName;
  String shareType;
  int shareSituation;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String  getShareType() {
        return shareType;
    }

    public void setShareType(String  shareTyep) {
        this.shareType = shareTyep;
    }

    public int getShareSituation() {
        return shareSituation;
    }

    public void setShareSituation(int shareSituation) {
        this.shareSituation = shareSituation;
    }
}
