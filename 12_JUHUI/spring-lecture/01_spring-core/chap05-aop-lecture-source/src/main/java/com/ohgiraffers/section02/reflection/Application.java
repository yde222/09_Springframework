package com.ohgiraffers.section02.reflection;

public class Application {
    public static void main(String[] args) {
        Class class1 = Account.class;
        System.out.println("class1 = " + class1);

        Class class2 = new Account().getClass();
        System.out.println("class2 = " + class2);

        try {
            Class.forName("com.ohgiraffers.section02.reflection.Account");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        double[] arr = {0.1, 0.2};
        System.out.println("arr = " + arr);
        Class class3 = Account.class;
    }
}
