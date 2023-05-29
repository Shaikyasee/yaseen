package controller.dal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dadu.Employee;

public class employecontroller implements employeeinterface {
	
	Scanner sc = new Scanner(System.in);
	Employee emp;
	List<Object> emplist = new ArrayList<>(); 
	public void addEmployee()
	{		
		emp = new Employee();
		System.out.println("Enter Eno");
		int eno =sc.nextInt();
		emp.setEmpno(eno);
		
		System.out.println("Enter Ename");
		String ename =sc.next();
		emp.setName(ename);
		emplist.add(emp);
		System.out.println("Employee Added Successfully");
		
	}
	
	public void viewEmployee() {
		//System.out.println(emp.getEmpno());
		//System.out.println(emp.getEname());
		
		System.out.println(emplist);
	}

}