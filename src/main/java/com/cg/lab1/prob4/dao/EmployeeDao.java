package com.cg.lab1.prob4.dao;

import java.util.List;
import java.util.NoSuchElementException;
//import java.util.Optional;
import java.util.OptionalDouble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.cg.lab1.prob4.dto.Employee;
import com.cg.lab1.prob4.interfaces.EmployeeDaoInterface;
import com.cg.lab1.prob4.util.EmployeeCollection;

@Component
public class EmployeeDao implements EmployeeDaoInterface {
	
	
	ApplicationContext factory= new AnnotationConfigApplicationContext(EmployeeCollection.class);
	
	public Employee viewEmpById(int empId) {
		List<Employee> empList=(List<Employee>) factory.getBean("getempList");
		for(Employee emp:empList)
		{
			if(emp.getEmpId()==empId)
				return emp;
		}
		return null;
	}
}

