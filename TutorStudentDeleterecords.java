package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TutorStudentDeleterecords {

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
			
			System.out.println("Enter the id");
			int id=sc.nextInt();
		
			
			String s="select * from student where sid="+id;
			ResultSet rs=st.executeQuery(s);
			if(rs.next()) {
				System.out.println("exists this ID");
				String ins="delete from student where sid="+id;
				int i=st.executeUpdate(ins);
			    if(i>0) {
			    	System.out.println("deleted");
			    }else {
			    	System.out.println("Not deleted"); 
			    	}
			}else {
				System.out.println("This id not exists");
				}
			
	}catch (Exception e) {
		e.printStackTrace();
	}

}


	}
