package ifconditions;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the value ");
		int num =sc.nextInt();
		
		if (num >0) {
			
			System.out.println(" The given no is positive");
			
		}
		else if(num==0) {
			
			System.out.println("The given no is zero");
		}
		else {
			System.out.println("The given no is negative");
		}
		
		

	}

}
