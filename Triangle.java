package assesment;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		float height,base,A;
	  
 
		System.out.println("Enter the value of height of triangle");
		height=Sc.nextInt();
		
		
		System.out.println("Enter the value of base");
		base=Sc.nextInt();
		
		A=(height*base)/2;
		System.out.println("The toatal area of triangle is ="+A);
		
		
	
		

	}

}
