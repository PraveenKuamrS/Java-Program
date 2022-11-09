package assesment;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner (System.in);
		float length,height,area;
		//area = length*height;
		System.out.println("Enter the length of rectangle : ");
		length = Sc.nextFloat();
		System.out.println("Enter the height of rectangle : ");
		height =Sc.nextFloat();
		 area = length*height;
		
		System.out.println("Total area of rectangle is =" +area);
		

	}

}
