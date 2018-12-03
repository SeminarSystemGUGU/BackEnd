package com.example.gugubird.Model;

import com.example.gugubird.Entity.ClassEntity;

import java.util.List;

public class StudentCourseVO {
    int courseId;
    String courseName;
    List<ClassEntity> classes;

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

    public List<ClassEntity> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassEntity> classes) {
        this.classes = classes;
    }
}
