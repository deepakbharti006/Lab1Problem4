package com.cg.lab1.prob4.util;


import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cg.lab1.prob4.dto.Employee;

@Configuration
public class EmployeeCollection {
	
	 private List<Employee> empList=new ArrayList<Employee>();
		
	    @Bean
	    public List<Employee> getempList(){
	    	
		empList.add(new Employee(100, "Rama",12345.67));
		empList.add(new Employee(101,"Sanjay",95021.0));
		empList.add(new Employee(102,"Abhay", 1200045.0));
		empList.add(new Employee(103,"Kaushalya",75030.0));
		empList.add(new Employee(104,"Deepak",85000.0));
		
		return empList;
	}	
}