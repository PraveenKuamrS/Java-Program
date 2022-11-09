package ifconditions;

import java.util.Scanner;

public class ifelseoddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner Sc=new Scanner (System.in);
		 
		 
		  
		System.out.println("Enter the values ");
       int a=Sc.nextInt();
      
      
        
        if (a%2==0) {
        	System.out.println("The is even values  =" +a);
        	
        	
        	
        }
        else {
        	System.out.println("This is odd values  =" +a);
        	
        }
	}

}
