package com.ohgiraffers.section02.reflection;

public class Application {
    public static void main(String[] args) {
        
       Class class1 = Account.class;
        System.out.println("class1 = " + class1);

        Class class2 = new Account().getClass();
        System.out.println("class2 = " + class2);

        Class.forName("com.ohgiraffers.section02.reflection.Account");
    }
}
