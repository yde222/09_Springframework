package com.ohgiraffers.practice.employee.view;

import com.ohgiraffers.practice.employee.controller.EmployeeController;
import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeController ec = new EmployeeController();
        while(true) {
            System.out.println("===== 회원 관리 ======");
            System.out.println("1. 회원 전체 조회");
            System.out.println("2. 회원 코드로 메뉴 조회");
            System.out.println("3. 회원 추가");
            System.out.println("4. 회원 수정");
            System.out.println("5. 회원 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("회원 관리 번호 입력 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    ec. selectAllEmployees();
                    break;
                case 2:
                    ec.selectOneEmployee(inputEmpId());
                    break;
                case 3:
                    ec.registMember(inputMember());
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");

            }
        }
    }

    private static EmployeeDTO inputMember() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String empName = sc.nextLine();
        System.out.print("주민번호를 입력하세요: ");
        String empNo = sc.nextLine();
        System.out.print("이메일을 입력하세요: ");
        String email = sc.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phone = sc.nextLine();
        System.out.print("부서코드를 입력하세요: ");
        String deptCode = sc.nextLine();
        System.out.print("직무코드를 입력하세요: ");
        String jobCode = sc.nextLine();
        System.out.print("급여를 입력하세요: ");
        int salary = sc.nextInt();
        String quitYN = "N";

        EmployeeDTO employee = new EmployeeDTO( );

        return employee;
    }

    private static Map<String, String> inputEmpId() {
        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴 코드 입력 : ");
        String empId = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);

        return parameter;
    }
}
