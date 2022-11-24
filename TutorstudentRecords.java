
// program for get the values in sql tutorpraveen database.
package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TutorstudentRecords {

	public static void main(String[] args) {


		String driver ="com.mysql.cj.jdbc.Driver";
		String un="root";//un means username
		String pass="root";
		String url="jdbc:mysql://localhost:3306/tutorpraveen";
		
	
		try {
			//load driver
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,un,pass);
			Statement st=conn.createStatement();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name");
			String name=sc.nextLine();
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			
			
			String s="select * from student where sid="+id;
			ResultSet rs=st.executeQuery(s);
			if(rs.next()) {
				System.out.println("Already exists this ID");
				
			}else {
				String ins="insert into student values("+id+",'"+name+"',"+age+")";//insert
			    int i=st.executeUpdate(ins);//insert,delete passing
			    if(i>0) {
			    	System.out.println("Inserted");
			    }else {
			    	System.out.println("Not inserted");
			    }
				
			}
			
			
	}catch (Exception e) {
		e.printStackTrace();
	}

}
}