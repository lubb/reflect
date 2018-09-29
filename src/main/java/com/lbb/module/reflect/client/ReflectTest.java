package com.lbb.module.reflect.client;

import com.lbb.module.reflect.model.Student;

public class ReflectTest {

    public static void main(String[] args){

        /**
         * 1、获取Class对象的三种方式
            1.1 Object ——> getClass();
            1.2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
            1.3 通过Class类的静态方法：forName（String  className）(常用)
         */

        //第一种方式获取Class对象
        Student stu = new Student();
        Class c1 = stu.getClass();
        System.out.println(c1.getName());

        //第二种方式获取Class对象
        Class c2 = Student.class;
        System.out.println(c2.getName());
        System.out.println(c1==c2);

        //第三种方式获取Class对象
        try {
            Class c3 = Class.forName("com.lbb.module.reflect.model.Student");
            System.out.println(c3.getName());
            System.out.println(c3==c2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
