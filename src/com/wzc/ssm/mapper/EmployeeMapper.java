package com.wzc.ssm.mapper;

import com.wzc.ssm.beans.Employee;

import java.util.List;


public interface EmployeeMapper {

	//查询列表
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
