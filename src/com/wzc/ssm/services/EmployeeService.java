package com.wzc.ssm.services;

import com.wzc.ssm.beans.Employee;

import java.util.List;

public interface EmployeeService {

    //查询多行数据
    public List<Employee> getAllEmps();

    //查询单条
    public Employee get(Integer id);

    //添加
    public void addEmployee(Employee employee);

    //修改
    public void updateEmployee(Employee employee);

    //删除
    public void deleteEmployee(Integer id);

}
