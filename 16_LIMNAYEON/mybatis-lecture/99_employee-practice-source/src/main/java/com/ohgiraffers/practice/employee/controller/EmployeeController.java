package com.ohgiraffers.practice.employee.controller;

import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.practice.employee.model.service.EmployeeService;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController() {
        this.employeeService = new EmployeeService();
    }


    public void selectAll() {
        List<EmployeeDTO> empList = employeeService.selectAll();
        empList.forEach(System.out::println);
    }

    public void selectByEmpCode(Map<String, String> parameter) {
        int empId = Integer.parseInt(parameter.get("empId"));

        EmployeeDTO employee = employeeService.selectEmployeeById(empId);

        if(employee != null) {
            System.out.println(employee);  // EmployeeDTO에 toString() 오버라이드 되어 있으면 잘 출력됨
        } else {
            System.out.println("해당 사원 정보를 찾을 수 없습니다."); // 에러 메시지 직접 출력
        }
    }
}
