package practice;

import java.util.Scanner;

public class Caluclator {

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
	 float x,y,z,v,n,m;
	 System.out.println("Enter the value1 ");
	 x=Sc.nextFloat();
	 String r;
	 System.out.println("Enter the operator(+,-,/,*)");
	 r=Sc.next();
	 System.out.println("Enter the value2");
	 y= Sc.nextFloat();


	 z= x+y;
	 
	//System.out.println("Your answer is ="+z);
	 v= x-y;
	// System.out.println("Your answer is ="+z);
	 n= x * y;
	 //System.out.println("Your answer is ="+z);
	 m= x/y;
	 
	  System.out.println("Your add answer is ="+z);
	  System.out.println("Your  sub answer is ="+v);
	  System.out.println("Your mul  answer is ="+n);
	  System.out.println("Your  div answer is ="+m);
	 
	 
		
		
		
		
		
		 
		}

}
