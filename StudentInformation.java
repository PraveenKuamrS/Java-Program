package com.edu;

import java.util.Scanner;

class Student {
	 String sname;
	 int sid;
	 float sfees;
	 static String cname,esalary;
	
	 
	 void acceptData() {
		 Scanner Sc=new Scanner (System.in);
		 System.out.println("Enter the student name :");
		 sname=Sc.next();
		 System.out.println("Enter the student id :");
		 sid=Sc.nextInt();
		 System.out.println("Enter the student fees :");
		 sfees=Sc.nextFloat();
	 }
	 void display() {
		
		 System.out.println("Student Name =" +sname);
		 System.out.println("Student ID =" +sid);
		 System.out.println("Student Fees =" +sfees);
		 
		 
	 }
	    
	 
 }

public class StudentInformation {

	public static void main(String[] args) {
		
		Student sob1=new Student();
		Student sob2=new Student();
		//StudentInformation sob2=new StudentInformation();
		sob1.acceptData();
		sob2.acceptData();
		sob1.display();
		sob2.display();
	}



		
		

	

}
