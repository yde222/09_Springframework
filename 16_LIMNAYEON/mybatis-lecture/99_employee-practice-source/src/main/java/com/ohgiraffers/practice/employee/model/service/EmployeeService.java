package com.ohgiraffers.practice.employee.model.service;

import com.ohgiraffers.practice.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.common.Template.getSqlSession;

public class EmployeeService {

    public List<EmployeeDTO> selectAll() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeDTO> menuList = employeeMapper.selectAll();

        sqlSession.close();

        return menuList;
    }

    public EmployeeDTO selectEmployeeById(int empId) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        EmployeeDTO employee = employeeMapper.selectMenuByMenuCode(empId);

        sqlSession.close();

        return employee;
    }
}
