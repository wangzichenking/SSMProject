package com.wzc.ssm.services;

import com.wzc.ssm.beans.Employee;
import com.wzc.ssm.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmps() {

        return employeeMapper.getAllEmps();
    }

    @Override
    public Employee get(Integer id) {
        return employeeMapper.get(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeMapper.deleteEmployee(id);
    }
}
