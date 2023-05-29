package view.dadu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import Usernotfoundexception.dadu.usernotfoundexception;
import controller.dadu.employeecontroller;

public class mainclass {

	public static void main(String[] args) {

		employeecontroller ec = new employeecontroller();
		try (Scanner Sc = new Scanner(System.in)) {
			String ch = null;

			try {
				String un = null;
				String pwd = null;

				System.out.println("Welcome to java class");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				System.out.println("Enter Username");
				un = br.readLine();
				System.out.println("Enter Password");
				pwd = br.readLine();

				if (un.equals("Deeps") && pwd.equals("pass")) {
					System.out.println("Welcome " + un);
				} else {
					throw new Exception();
				}

			} 

			catch (usernotfoundexception unf) {
				unf.printStackTrace();
			}

			catch (Exception ae) {
				System.out.println("IO");
			} finally {
				System.out.println("Finally .....");
			}
			System.out.println("Main Ends");

			do {
				System.out.println("Enter your choice");
				System.out.println("1.Addemployee");
				System.out.println("2.Viewemployee");
				int choice = Sc.nextInt();
				switch (choice) {

				case 1:
					ec.Viewemployee();
					break;
				case 2:
					ec.Viewemployee();
					break;
				default:
					System.out.println("Enter a valid value");
					break;
				}
				System.out.println("Do u want to continue Y | y");
				ch = Sc.next();

			} while (ch.equals("Y") || ch.equals("y"));
		}
		System.out.println("Thanks for using our system.");
		System.exit(0);
	}
}