package com.edu;

import java.util.Scanner;


		class Employee{
			int eid;
			String ename,edept;
			//float esalary;
			static String cname, esalary;
			 static {
				 cname ="Edubridge ";
				 esalary= "10000 per month";
			 }
			 
			void inputData() {
				Scanner Sc = new Scanner(System.in);
				System.out.println("Enter the name ");
				ename =Sc.next();
				System.out.println("Enter the dept ");
				edept=Sc.next();
				System.out.println("Enter the id ");
				eid=Sc.nextInt();
				//System.out.println("Enter the salary ");
				//esalary= Sc.nextFloat();
			}
				
				void display() {
                    System.out.println( "Company Name =" +cname);
                    System.out.println("Salary ="+esalary);
					System.out.println("Name= "+ename );
					System.out.println("Department= "+edept);
					System.out.println("Id="+eid);
					//System.out.println("Salary "+esalary);
				
				
				
			}
		
		
		

	

}
		public class MainApp{
			public static void main(String args []) {
	
				Employee eob=new Employee();
				Employee eob1=new Employee();
				Employee eob2=new Employee();
				
				eob.inputData();
				eob1.inputData();
				eob2.inputData();
				eob.display();
				eob1.display();
			    eob2.display();
				
				
			}
		}
		

