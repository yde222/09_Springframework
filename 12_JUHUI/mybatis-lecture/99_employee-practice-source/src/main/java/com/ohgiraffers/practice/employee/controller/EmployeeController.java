package com.ohgiraffers.practice.employee.controller;

import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.practice.employee.model.service.EmployeeService;

import java.util.List;

public class EmployeeController {

    private EmployeeService employeeService = new EmployeeService();// 사용하려면 연결해줘야함.

    public List<EmployeeDTO> selectAllEmployee() {
        List<EmployeeDTO> empList = employeeService.selectAllEmployee();
        return empList;
    }
}
