package com.edu;

public class Arryerror {

	public static void main(String[] args) {
		int ar[]=new int[4];
		
		System.out.println("Before the arry assign value");
		try {
		ar[0]=98;
		ar[1]=98;
		ar[2]=98;
		ar[3]=98;
		ar[4]=98;
		}
		catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
		}

System.out.println("After array value asign");
	}

}
