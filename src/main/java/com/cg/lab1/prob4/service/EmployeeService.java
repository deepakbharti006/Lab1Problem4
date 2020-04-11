package com.cg.lab1.prob4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.lab1.prob4.dao.EmployeeDao;
import com.cg.lab1.prob4.dto.Employee;
import com.cg.lab1.prob4.interfaces.EmployeeDaoInterface;
import com.cg.lab1.prob4.interfaces.EmployeeServiceInterface;

@Component
public class EmployeeService implements EmployeeServiceInterface {
	
	@Autowired
	EmployeeDaoInterface empDao;
	
	public Employee viewEmpById(int empId)
	{
		return empDao.viewEmpById(empId);
		
	}

	
}