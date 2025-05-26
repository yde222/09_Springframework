package com.ohgiraffers.section02.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {

    public static void main(String[] args) {
        
        Class class1 = Account.class;
        System.out.println("class1 = " + class1);

        Class class2 = Account.class;
        System.out.println("class2 = " + class2);

        try {
            Class class3 = Class.forName("com.ohgiraffers.section02.reflection.Account");
            System.out.println("class3 = " + class3);
            
            double[] arr = {0.1, 0.2};
            System.out.println("arr = " + arr);
            Class class4 = Class.forName("[D");
            Class class5 = double[].class;

            System.out.println("class4 = " + class4);
            System.out.println("class5 = " + class5);

            // 원시 자료형은 Class 정보가 존재하지 않는다.
            double d = 1.0;
//            Class class6 = d.class;
            // 상속된 부모 클래스 반환
            Class superClass = class1.getSuperclass();
            System.out.println("superClass = " + superClass);

            //필드 반환
            Field[] declaredField = class1.getDeclaredField();
            for(Field field : declaredField) {
                System.out.println("modifiers = " + Modifier.toString(field.getModifiers()));
                System.out.println("name = " + field.getName());
                System.out.println("type = " + field.getType());

            }

            Method[] methods = class1.getMethods();
            Method getBalanceMethod = null;
            for(Method method : methods) {
                System.out.print(Modifier.toString(method.getModifiers()) + " ");
                System.out.print(method.getReturnType().getSimpleName() + " ");
                System.out.println(method.getName());

                if("getBalance".equals(method.getName())) {
                    getBalanceMethod = method;
                }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
