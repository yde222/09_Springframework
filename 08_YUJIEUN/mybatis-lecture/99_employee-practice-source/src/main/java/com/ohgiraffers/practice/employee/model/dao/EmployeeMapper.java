package com.ohgiraffers.practice.employee.model.dao;

import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import java.util.List;

public interface EmployeeMapper {

    List<EmployeeDTO> selectAllEmp();

    EmployeeDTO selectEmpByEmpId(String empId);

    int insertEmp(EmployeeDTO employee);

    int updateEmp(EmployeeDTO employee);

    int deleteEmp(String empId);
}
