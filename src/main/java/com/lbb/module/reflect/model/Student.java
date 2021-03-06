package com.lbb.module.reflect.model;

public class Student {

    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    //（默认的构造方法）
    Student(String str){
        System.out.println("(默认)的构造方法 s = " + str);
    }

    //无参构造方法
    public Student(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public Student(char name){
        System.out.println("姓名：" + name);
    }

    //有一个参数的构造方法
    public Student(int age){
        System.out.println("年纪：" + age);
    }

    //有多个参数的构造方法
    public Student(String name ,int age){
        System.out.println("姓名："+name+"年龄："+ age);//这的执行效率有问题，以后解决。
    }

    //受保护的构造方法
    protected Student(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    public void show(String s){
        System.out.println("调用了：公有的，String参数的show(): s = " + s);
    }

}
