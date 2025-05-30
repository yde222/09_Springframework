package com.ohgiraffers.practice.employee.controller;

import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.practice.employee.model.service.EmployeeService;
import com.ohgiraffers.practice.employee.view.PrintView;

import java.util.List;
import java.util.Map;

public class EmployeeController {
    private final EmployeeService employeeService;
    private final PrintView printView;

    public EmployeeController() {
        this.employeeService = new EmployeeService();
        this.printView = new PrintView();
    }

    public void selectAllMember() {
        List<EmployeeDTO> employeeList = employeeService.selectAllMember();

        if (employeeList != null && !employeeList.isEmpty()) {
            printView.printEmployeeList(employeeList);
        } else {
            printView.printErrorMessage("selectAllMember");
        }
    }

    public void selectMemberByID(Map<String, String> parameter) {
        int empId = Integer.parseInt(parameter.get("empId"));

        EmployeeDTO employee = employeeService.selectMemberByID(empId);

        if (employee != null) {
            printView.printEmployee(employee);
        } else {
            printView.printErrorMessage("selectMemberByID");
        }
    }
}
