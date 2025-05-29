package com.ohgiraffers.practice.employee.model.service;

import com.ohgiraffers.practice.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.common.Template.getSqlSession;

public class EmployeeService {
    public List<EmployeeDTO> selectAllEmployees() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeDTO> menuList = employeeMapper.selectAllEmployees(sqlSession);

        sqlSession.close();

        return menuList;
    }

    public EmployeeDTO selectOneEmployee(int empId) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        EmployeeDTO employeeDTO = employeeMapper.selectOneEmployee(empId);

        sqlSession.close();

        return employeeDTO;
    }

    public boolean registEmployee(EmployeeDTO employeeDTO) {

        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = employeeMapper.insertEmployee(employeeDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean updateEmployee(EmployeeDTO employee) {

        SqlSession sqlSession = getSqlSession();
        EmployeeMapper menuMapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = menuMapper.updateEmployee(employee);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;

    }

    public boolean deleteEmployee(int empId) {

        SqlSession sqlSession = getSqlSession();
        EmployeeMapper menuMapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = menuMapper.deleteEmployee(empId);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }
}
