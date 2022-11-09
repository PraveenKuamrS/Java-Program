package com.edu;

public class exceptionerror {

	public static void main(String[] args) {
		int a=10,b=2,c=0;// useb=0
		int ar[]=new int[4];
		System.out.println("Before division");
		System.out.println("Array assignment");
		try {
		c=a/b;
		
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			ar[5]=90;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("After division");
		System.out.println("after array assignment");



	}

}
