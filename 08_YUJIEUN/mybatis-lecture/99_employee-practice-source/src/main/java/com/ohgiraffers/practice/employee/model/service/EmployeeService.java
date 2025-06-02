package com.ohgiraffers.practice.employee.model.service;

import com.ohgiraffers.practice.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.practice.employee.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.common.Template.getSqlSession;

public class EmployeeService {

    public List<EmployeeDTO> selectAllEmp() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeDTO> empList = employeeMapper.selectAllEmp();
        sqlSession.close();
        return empList;
    }

    public EmployeeDTO selectEmpByEmpId(String empId) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        EmployeeDTO emp = employeeMapper.selectEmpByEmpId(empId);
        sqlSession.close();
        return emp;
    }

    public boolean registEmp(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.insertEmp(emp);

        if (result > 0) sqlSession.commit();
        else sqlSession.rollback();

        sqlSession.close();
        return result > 0;
    }

    public boolean modifyEmp(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.updateEmp(emp);

        if (result > 0) sqlSession.commit();
        else sqlSession.rollback();

        sqlSession.close();
        return result > 0;
    }

    public boolean deleteEmp(String empId) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.deleteEmp(empId);

        if (result > 0) sqlSession.commit();
        else sqlSession.rollback();

        sqlSession.close();
        return result > 0;
    }
}
