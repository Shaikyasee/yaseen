package sample.doc;

class Employee {

	int empno;
	String ename = "sai";

	salary sal;


	public Employee() {
		this("Mani");
		this.empno = 3;
		System.out.println("From Employee Constructor" + ename);
	}

	public Employee(String str) {

		System.out.println("From Employee Constructor" + str);
	}

	public  String getDetails() {
		return (empno + " -- " + ename + " --- " + sal);
	}
	
	public void showIdCard() {
		System.out.println("My Id ....");
	}

	public char[] getEname() {
		return null;
	}

	public char[] getEno() {
		return null;
	}

}

class Manager extends Employee {
	String dept = "IT";

	public Manager() {
		super(); // used to invoke base clas constructor
		System.out.println("From Mgr Constr");

	}

	public String getDetails() {
		return super.getDetails() + "--  " + dept;
	}
	
	public void showProjectDetails() {
		System.out.println("Showing projects...");
	}

}

public class Mainclass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.getDetails());

		Manager mgr = new Manager();
		System.out.println(mgr.getDetails());
		
		Employee e1 = new Manager();  //Polymorphic object
		
		System.out.println(e1.getDetails()); //Virtual Method Invocation
		e1.showIdCard();
		
		if(emp instanceof Manager) {
			System.out.println("I am Employee");
		}else {
			System.out.println("I am Manager");
		}
		
		//Manager m1 =(Manager) new Employee();

	}

}
