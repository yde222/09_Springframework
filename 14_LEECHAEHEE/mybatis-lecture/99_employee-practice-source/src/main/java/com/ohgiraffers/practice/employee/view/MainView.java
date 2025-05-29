package com.ohgiraffers.practice.employee.view;

import com.ohgiraffers.practice.employee.controller.EmployeeController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        while(true) {
            System.out.println("===== 회원 관리 ======");
            System.out.println("1. 회원 전체 조회");
            System.out.println("2. 회원 코드로 조회");
            System.out.println("3. 회원 추가");
            System.out.println("4. 회원 수정");
            System.out.println("5. 회원 삭제");
            System.out.print("회원 관리 번호 입력 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    employeeController.selectAllMember();
                    break;
                case 2:
                    employeeController.selectMemberByID(inputEmpId());
                    break;
                case 3:
//                    employeeController.insertMember(inputEmp());
                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("잘못 된 번호를 선택하셨습니다.");
            }
        }
    }

//    private static Map<String, String> inputEmp() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("회원 이름을 입력하세요 : ");
//        String empName = sc.nextLine();
//        System.out.print("회원 주민번호를 입력하세요 : ");
//        String empNo = sc.nextLine();
//        System.out.print("회원 이메일을 입력하세요 : ");
//        String email = sc.nextLine();
//        System.out.print("회원 전화번호를 입력하세요 : ");
//        String phone = sc.nextLine();
//        System.out.print("회원 급여를 입력하세요 : ");
//        String salary = sc.nextLine();
//    }

    private static Map<String, String> inputEmpId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 코드 입력 : ");
        String empId = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        return parameter;
    }

}
