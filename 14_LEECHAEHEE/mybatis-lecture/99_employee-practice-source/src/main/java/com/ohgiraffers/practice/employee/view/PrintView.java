package com.ohgiraffers.practice.employee.view;

import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;

import java.util.List;

public class PrintView {

    public void printEmployeeList(List<EmployeeDTO> employeeList) {
        System.out.println("===== 사원 목록 =====");
        for (EmployeeDTO employeeDTO : employeeList) {
            System.out.println(employeeDTO);
        }

    }

    public void printErrorMessage(String errorCode) {
        System.out.println("==== Error =====");
        String errorMessage = switch (errorCode) {
            case "selectAllMember" -> "메뉴 목록 조회에 실패했습니다.";
            case "selectMemberByID" -> "사원 ID로 사원 조회에 실패했습니다.";
            default -> "";
        };

        System.out.println(errorMessage);
    }

    public void printEmployee(EmployeeDTO employee) {
        System.out.println("======== 조회된 사원 ============");
        System.out.println(employee);
    }
}
