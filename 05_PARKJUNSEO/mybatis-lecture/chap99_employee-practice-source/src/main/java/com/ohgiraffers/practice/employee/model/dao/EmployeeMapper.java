package com.ohgiraffers.practice.employee.model.dao;

import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeDTO> selectAllEmployees(SqlSession sqlSession);

    EmployeeDTO selectOneEmployee(int empId);

    int insertEmployee(EmployeeDTO employeeDTO);

    int updateEmployee(EmployeeDTO employee);

    int deleteEmployee(int empId);
}
