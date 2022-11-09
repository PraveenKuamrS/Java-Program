package assesment;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
	float radius,A;
	
		System.out.println("Enter the value of radius");
		radius=Sc.nextFloat();
		A=3.14f*radius * radius;
		System.out.println("Total area of circle is ="+A);
		
	}

}
