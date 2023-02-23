package com.xkq.spring._04di_map;

/**
 * @author: xkq
 * @date: 2023/2/23 19:30
 * @description:
 */
public class Teacher {
    private String tid;

    private String name;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
