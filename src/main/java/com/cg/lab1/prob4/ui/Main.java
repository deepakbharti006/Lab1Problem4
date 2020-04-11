package com.cg.lab1.prob4.ui;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab1.prob4.dto.Employee;
import com.cg.lab1.prob4.interfaces.EmployeeServiceInterface;
import com.cg.lab1.prob4.service.EmployeeService;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.cg.Lab1.prob4");
		context.refresh();
		
		Scanner inputNumber=new Scanner(System.in);
		int empId;
		System.out.println("Enter the Employee ID to display:");
		empId=inputNumber.nextInt();
		
		EmployeeServiceInterface empService=context.getBean(EmployeeService.class);
		Employee employee=empService.viewEmpById(empId);
			
			if(employee!=null) {
				System.out.println("Employee Info:");
				
				System.out.println("----------------------------");
				System.out.println("Employee ID  :"+employee.getEmpId());
				System.out.println("Employee NAME  :"+employee.getName());
				System.out.println("Employee SALARY  :"+employee.getSalary());
			}
			else {
				System.out.println("Employee with employee ID "+empId+" Does Not exist");
			}		
		
		context.close();
		}
}

