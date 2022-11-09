package com.edu;

public class Zeroaerror {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("Before division ");
		try {
		c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("After division "+c);
		

	}

}
