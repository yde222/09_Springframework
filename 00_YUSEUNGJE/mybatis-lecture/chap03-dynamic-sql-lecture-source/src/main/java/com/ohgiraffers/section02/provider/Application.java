package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.SearchCriteria;

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
                case 2 : /*sqlBuilderSubMenu();*/ break;
                case 9 : return;
            }


        } while(true);
    }

    private static void selectBuilderSubMenu() {

        Scanner sc = new Scanner(System.in);
        SelectBuilderService selectBuilderService = new SelectBuilderService();
        do {
            System.out.println("===== SelectBuilder 서브 메뉴 =====");
            System.out.println("1. SelectBuilder 기본 구문 사용");
            System.out.println("2. SelectBuilder를 이용한 동적 SQL 사용");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : selectBuilderService.testSimpleStatement(); break;
                case 2 : selectBuilderService.testDynamicStatement(inputSearchCriteria()); break;
                case 9 : return;
            }

        } while(true);
    }

    private static SearchCriteria inputSearchCriteria() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색 기준을 입력해주세요(name or category) : ");
        String condition = sc.nextLine();
        System.out.print("검색어를 입력해주세요 : ");
        String value = sc.nextLine();

        return new SearchCriteria(condition, value);
    }
}
