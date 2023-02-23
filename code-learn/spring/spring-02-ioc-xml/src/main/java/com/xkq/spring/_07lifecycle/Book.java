package com.xkq.spring._07lifecycle;

/**
 * @author: xkq
 * @date: 2023/2/22 23:01
 * @description:
 */
public class Book {
    private String id;

    private String name;

    private String author;

    private String type;

    public void initMethod(){
        System.out.println("4. bean对象初始化");
    }

    public void destroyMethod() {
        System.out.println("7. bean 对象销毁");
    }

    public Book() {
        System.out.println("1. 创建对象 调用无参构造");
    }

    public Book(String id, String name, String author, String type) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        System.out.println("有参构造执行");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("2. 依赖注入 设置对象属性");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
