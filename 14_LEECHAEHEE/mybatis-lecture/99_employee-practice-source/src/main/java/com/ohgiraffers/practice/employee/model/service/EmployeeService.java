package com.ohgiraffers.practice.employee.model.service;

import com.ohgiraffers.practice.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.common.Template.getSqlSession;

public class EmployeeService {
    public List<EmployeeDTO> selectAllMember() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeDTO> employeeList = employeeMapper.selectAllMember();

        sqlSession.close();

        return employeeList;
    }

    public EmployeeDTO selectMemberByID(int empId) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        EmployeeDTO employee = employeeMapper.selectMemberByID(empId);

        sqlSession.close();

        return employee;
    }
}
