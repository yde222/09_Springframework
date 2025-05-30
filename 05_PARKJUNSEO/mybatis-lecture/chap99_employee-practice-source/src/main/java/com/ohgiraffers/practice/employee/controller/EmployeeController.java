package com.ohgiraffers.practice.employee.controller;

import com.ohgiraffers.practice.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.practice.employee.model.service.EmployeeService;
import com.ohgiraffers.practice.employee.view.PrintView;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.practice.common.Template.getSqlSession;

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
        int empId = Integer.parseInt(parameter.get("empId"));
        EmployeeDTO employee = es.selectOneEmployee(empId);

        if(employee != null) {
            pv.printMenu(employee);
        } else {
            pv.printErrorMessage("selectOneEmployee");
        }
    }

    public void registEmployee(EmployeeDTO employeeDTO) {

        if (es.registEmployee(employeeDTO)) {
            pv.printSuccessMessage("insert");
        } else {
            pv.printErrorMessage("insert");
        }
    }

    public void updateEmployee(Map<String, String> parameter) {

        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmpName(parameter.get("empName"));
        employee.setEmpNo(parameter.get("empNo"));
        employee.setEmail(parameter.get("email"));
        employee.setPhone(parameter.get("phone"));
        employee.setDeptCode(parameter.get("deptCode"));
        employee.setJobCode(parameter.get("jobCode"));
        employee.setSalary(Integer.parseInt(parameter.get("salary")));
        employee.setQuitYN(parameter.get("quitYN"));

        if(es.updateEmployee(employee)) {
            pv.printSuccessMessage("update");
        } else {
            pv.printSuccessMessage("update");
        }
    }

    public void deleteEmployee(Map<String, String> parameter) {

        int empId = Integer.parseInt(parameter.get("empId"));

        if(es.deleteEmployee(empId)) {
            pv.printSuccessMessage("delete ");
        } else {
            pv.printSuccessMessage("delete");
        }

    }
}
