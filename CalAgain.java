package practice;

import java.util.Scanner;

public class CalAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner (System.in);
		float answer, result,a,b;
		System.out.println("Enter the value1");
		result = Sc.nextFloat();	
		
		//int n = 0 ;
		//for ( int i=0;i>n;i++) {
		//	System.out.println(i);
		//}
		System.out.println(" Enter the operator(+, -, *, /)" );
		String r,s;
		r= Sc.next();
	//stem.out.println("Final"+r);
		System.out.println("Enter the value2");
		result =Sc.nextFloat();
		answer = result + result;
		answer = result - result;
		answer = result * result;
		answer = result / result;
		System.out.println ( "Your Final result is ="+answer);
		
		
		
		
		
		

	}

}
