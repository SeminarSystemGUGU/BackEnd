package com.example.gugubird.Model;

public class ShareCourseVO {
  String courseName;
  String teacherName;
  int shareType;
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

    public int getShareType() {
        return shareType;
    }

    public void setShareType(int shareTyep) {
        this.shareType = shareTyep;
    }

    public int getShareSituation() {
        return shareSituation;
    }

    public void setShareSituation(int shareSituation) {
        this.shareSituation = shareSituation;
    }
}
