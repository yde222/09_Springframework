package com.ohgiraffers.practice.employee.view;

import com.ohgiraffers.practice.employee.controller.EmployeeController;

import java.util.Scanner;

public class MainView {

    private final Scanner sc = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();

    public void displayMenu() {
        do {
            System.out.println("\n==== 직원 관리 프로그램 ====");
            System.out.println("1. 직원 전체 조회");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    employeeController.selectAllEmployees();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        } while (true);
    }
}
