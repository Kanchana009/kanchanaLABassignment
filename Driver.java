package com.gl.itsupportadmin.main;
import java.util.Scanner;
import com.gl.itsupportadmin.pojo.*;
import com.gl.itsupportadmin.service;

public class Driver {
	public static void main(String) {
		String department="lang";
		Employee emp=new Employee("Kanchana" + "Karthikeyan");
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		Scanner sc=new Scanner(System.in);
				int option=sc.nextInt();
				Service service=new Service();
		switch(opt) 
		{
		case 0:
			System.out.println("invalid option");
			break;
		case 1:
			department="Technical";
			break;
		case 2:
			department="Admin";
			break;
		case 3:
			department="HR";
			break;
		case 4:
			department="Legal";
			break;
			default:
		    System.out.println("please enter option");
        }
		
		
		public String generateEmail("String firstName+ String lastName + String department")
		{
			System.out.println("firstName+gmail.com");
		}
	
	}
}

