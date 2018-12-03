package com.example.gugubird.Model;

import com.example.gugubird.Entity.ClassEntity;

import java.util.List;

public class TeacherCourseVO {
    int courseId;
    String courseName;
    int status;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
