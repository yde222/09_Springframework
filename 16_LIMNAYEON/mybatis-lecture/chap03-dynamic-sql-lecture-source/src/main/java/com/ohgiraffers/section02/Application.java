package com.ohgiraffers.section02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("===== 구문 빌더 API를 이용한 동적 SQL =====");
            System.out.println("1. SelectBuilder 테스트");
            System.out.println("2. SqlBuilder 테스트");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : selectBuilderSubMenu(); break;
//                case 2 : sqlBuilderSubMenu(); break;
                case 9 : return;
            }


        } while(true);
    }

    private static void selectBuilderSubMenu() {
    }
}
