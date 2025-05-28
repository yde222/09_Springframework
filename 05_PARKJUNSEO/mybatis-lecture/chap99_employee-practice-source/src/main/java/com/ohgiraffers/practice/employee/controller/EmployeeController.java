package com.ohgiraffers.practice.employee.controller;

import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.practice.employee.model.service.EmployeeService;
import com.ohgiraffers.practice.employee.view.PrintView;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final EmployeeService es = new EmployeeService();
    private final PrintView pv = new PrintView();

    public EmployeeController() {}

    public void selectAllEmployees() {

        List<EmployeeDTO> memberList = es.selectAllEmployees();

        if(memberList != null && !memberList.isEmpty()) {
            pv.printEmployeeList(memberList);
        } else {
            pv.printErrorMessage("selectAllEmployees");
        }
    }

    public void selectOneEmployee(Map<String, String> parameter) {

    }

    public void registMember(EmployeeDTO employeeDTO) {
    }
}
