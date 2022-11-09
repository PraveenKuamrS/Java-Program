package assesment;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String empname , empdept;
		int empage;
		float empsalary;
		double empyearsalary;
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the employee name ");
		empname = Sc.next();
		System.out.println("Enter the employee dept ");
		empdept=Sc.next();
		System.out.println("Enter the employee age ");
		empage=Sc.nextInt();
		System.out.println("Enter the employee salary ");
		empsalary=Sc.nextFloat();
		
		empyearsalary=empsalary *12;
				
		System.out.println("The  "+empname+"  year salary is:" +empyearsalary);
		
		
		

	}

}
