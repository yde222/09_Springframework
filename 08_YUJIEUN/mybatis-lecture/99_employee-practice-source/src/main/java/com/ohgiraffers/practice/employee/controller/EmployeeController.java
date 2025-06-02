package com.ohgiraffers.practice.employee.controller;

import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.practice.employee.model.service.EmployeeService;
import com.ohgiraffers.practice.employee.view.PrintResult;

import java.util.List;

public class EmployeeController {

    private final EmployeeService employeeService;
    private final PrintResult printResult;

    // 기본 생성자에서 직접 객체 생성
    public EmployeeController() {
        this.employeeService = new EmployeeService();
        this.printResult = new PrintResult();
    }


    public EmployeeController(EmployeeService employeeService, PrintResult printResult) {
        this.employeeService = employeeService;
        this.printResult = printResult;
    }

    public void selectAllEmployees() {
        List<EmployeeDTO> empList = employeeService.selectAllEmp();

        if (empList != null && !empList.isEmpty()) {
            printResult.printEmpList(empList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectEmployeeById(Integer id) {

    }
}
