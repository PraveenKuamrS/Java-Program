package com.edu;

public class ExampleStringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String s1="Hello";
		String s2=new String ("Hello");
		boolean b=(s==s1);
		System.out.println("Boolean="+b);
		boolean b1=(s2==s1);
		System.out.println("Boolean="+b1);
		

		System.out.println("S and s1 values are same ="+b);
		System.out.println("s2 and s1 values are same ="+b1);
		
		
		

	}

}
