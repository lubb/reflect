package com.lbb.module.reflect.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectMethodTest {

    public static void main(String[] args) throws Exception{
        //1.加载Class对象
        Class clazz = Class.forName("com.lbb.module.reflect.model.Student");

        //获取所有共有的构造方法
        Constructor[] conArray = clazz.getConstructors();
        for (Constructor c : conArray){
            System.out.println(c);
        }

        //获取所有的构造方法
        conArray = clazz.getDeclaredConstructors();
        for (Constructor c : conArray){
            System.out.println(c);
        }

        //获取公有、无参的构造方法
        Constructor con = clazz.getConstructor(null);
        System.out.println(con);

        //获取私有构造方法
        con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);

        //获取成员变量
        Field[] fieldArray = clazz.getFields();
        for( Field field :fieldArray){
            System.out.println(field);
        }

        //获取所有的方法
        Method[] methodArray = clazz.getMethods();
        for(Method m : methodArray){
            System.out.println(m);
        }

    }

}
