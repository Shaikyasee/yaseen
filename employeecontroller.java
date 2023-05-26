package controller.dadu;

import java.util.Scanner;

import model.dadu.Employee;

public class employeecontroller {
	
	Scanner sc = new Scanner(System.in);
	 Employee emp = new Employee();
	 
	public void addSerialEg() {
		
		 int eno = sc.nextInt();
			emp.setEmpno(eno);
			
			
			
			int ename = sc.nextInt();
			
			emp.setEmpno(ename);
			
			
	}

	public void Viewemployee() {
		System.out.println("Enter eno");
		System.out.println(emp.getEmpno());
		System.out.println("Enter ename");
		System.out.println(emp.getEmpno());
		
		
	}

}
