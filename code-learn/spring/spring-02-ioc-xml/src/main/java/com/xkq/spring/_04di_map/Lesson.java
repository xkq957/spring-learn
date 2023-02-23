package com.xkq.spring._04di_map;

/**
 * @author: xkq
 * @date: 2023/2/23 19:25
 * @description:
 */
public class Lesson {
    private String lessonName;

    public Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
