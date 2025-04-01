package Corejava.dadu;

public class student {

	String name;
	int age;

	public String setName(String fullName) {
		name = fullName;
		return fullName;
	}

	public int age(int a) {
		age = a;
		return age;
	}

	public void display(String name , int age) {
		setName(name);
		age(age);
		System.out.println("Name:" + name);
		System.out.println("age:" + age);
	}

	public static void main(String[] args) {
		student setname = new student();
		setname.display("Mani",25);
//		System.out.println(setname.setName("mani"));
//		System.out.println(setname.age(25));

	}

}
