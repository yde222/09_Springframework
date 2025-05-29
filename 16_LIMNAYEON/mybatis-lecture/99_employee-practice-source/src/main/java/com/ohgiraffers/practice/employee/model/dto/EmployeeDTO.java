package com.ohgiraffers.practice.employee.model.dto;

public class EmployeeDTO {
    private int empId;
    private String empName;
    private String empNo;
    private String email;
    private String phone;
    private int deptCode;
    private int jobCode;
    private int salLevel;
    private int salary;
    private double bonus;
    private int managerId;
    private int hiredate;
    private int quitDate;
    private char quitYn;



    public EmployeeDTO() {
    }

    public EmployeeDTO(int empId, String empName, String empNo, String email, String phone, int deptCode, int jobCode, int salLevel, int salary, double bonus, int managerId, int hiredate, int quitDate, char quitYn) {
        this.empId = empId;
        this.empName = empName;
        this.empNo = empNo;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
        this.salary = salary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hiredate = hiredate;
        this.quitDate = quitDate;
        this.quitYn = quitYn;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(int deptCode) {
        this.deptCode = deptCode;
    }

    public int getJobCode() {
        return jobCode;
    }

    public void setJobCode(int jobCode) {
        this.jobCode = jobCode;
    }

    public int getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(int salLevel) {
        this.salLevel = salLevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getHiredate() {
        return hiredate;
    }

    public void setHiredate(int hiredate) {
        this.hiredate = hiredate;
    }

    public int getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(int quitDate) {
        this.quitDate = quitDate;
    }

    public char getQuitYn() {
        return quitYn;
    }

    public void setQuitYn(char quitYn) {
        this.quitYn = quitYn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode=" + deptCode +
                ", jobCode=" + jobCode +
                ", salLevel=" + salLevel +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId=" + managerId +
                ", hiredate=" + hiredate +
                ", quitDate=" + quitDate +
                ", quitYn=" + quitYn +
                '}';
    }
}
