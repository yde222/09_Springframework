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
            System.out.println("===== 사원 관리 ======");
            System.out.println("1. 사원 전체 조회");
            System.out.println("2. 사원 코드로 메뉴 조회");
            System.out.println("3. 사원 추가");
            System.out.println("4. 사원 수정");
            System.out.println("5. 사원 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("사원 관리 번호 입력 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    ec. selectAllEmployees();
                    break;
                case 2:
                    ec.selectOneEmployee(inputEmpId());
                    break;
                case 3:
                    ec.registEmployee(inputEmployee());
                    break;
                case 4:
                    ec.updateEmployee(inputUpdateEmployee());
                    break;
                case 5:
                    ec.deleteEmployee(inputEmpId());
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");

            }
        }
    }

    private static EmployeeDTO inputEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("사원번호를 입력하세요: ");
        int empId = sc.nextInt();
        sc.nextLine();  // ← 버퍼 비우기
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
        double salary = sc.nextDouble();
        String quitYN = "N";

        String salLevel = "S1";

        EmployeeDTO employee = new EmployeeDTO(empId, empName, empNo, email, phone, deptCode, jobCode, salLevel, salary, quitYN);

        return employee;
    }

    private static Map<String, String> inputEmpId() {
        Scanner sc = new Scanner(System.in);

        System.out.print("사원 번호 입력 : ");
        String empId = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);

        return parameter;
    }

    private static Map<String, String> inputUpdateEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 사원 번호를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.print("수정할 이름을 입력하세요: ");
        String empName = sc.nextLine();
        System.out.print("수정할 주민번호를 입력하세요: ");
        String empNo = sc.nextLine();
        System.out.print("수정할 이메일을 입력하세요: ");
        String email = sc.nextLine();
        System.out.print("수정할 전화번호를 입력하세요: ");
        String phone = sc.nextLine();
        System.out.print("수정할 부서코드를 입력하세요: ");
        String deptCode = sc.nextLine();
        System.out.print("수정할 직무코드를 입력하세요: ");
        String jobCode = sc.nextLine();
        System.out.print("수정할 급여를 입력하세요: ");
        int salary = sc.nextInt();
        System.out.print("수정할 재직 상태를 입력하세요: ");
        String quitYN = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salary", String.valueOf(salary));
        parameter.put("quitYN", quitYN);

        return parameter;
    }
}
