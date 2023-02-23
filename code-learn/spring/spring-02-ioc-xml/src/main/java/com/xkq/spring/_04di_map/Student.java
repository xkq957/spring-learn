package com.xkq.spring._04di_map;

import java.util.List;
import java.util.Map;

/**
 * @author: xkq
 * @date: 2023/2/23 19:29
 * @description:
 */
public class Student {
    private String sid;

    private String name;

    private List<Lesson> lessonList;

    private Map<String, Teacher> teacherMap;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", lessonList=" + lessonList +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
