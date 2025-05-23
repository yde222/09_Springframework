package com.ohgiraffers.section02.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Application {

    public static void main(String[] args) {
    
        Class class1 = Account.class;
        System.out.println("class1 = " + class1);

        Class class2 = new Account().getClass();
        System.out.println("class2 = " + class2);   // 위랑 똑같은 코드

        try {
            Class Class3 = Class.forName("com.ohgiraffers.section02.reflection.Account");
            System.out.println("Class3 = " + Class3);

            double[] arr = {0.1, 0.2};
            System.out.println("arr = " + arr);
            
            Class Class4 = Class.forName("[D");
            System.out.println("Class4 = " + Class4);
            
            Class Class5 = double[].class;
            System.out.println("Class5 = " + Class5);

//            원시 자료형은 Class 정보가 존재하지 않는다.
            double d = 1.0;
//            Class Class6 = d.class;

            // 부모 클래스 반환
            Class superClass = class1.getSuperclass();
            System.out.println("superClass = " + superClass);


            // 필드 반환
            Field[] fields = class1.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("modifiers = " + Modifier.toString(field.getModifiers()));
                System.out.println("name = " + field.getName());
                System.out.println("type = " + field.getType());
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
