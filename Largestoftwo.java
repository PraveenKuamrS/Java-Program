package conditionalstatement;

import java.util.Scanner;

public class Largestoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("Enter the 1st num ");
		 n1=Sc.nextInt();
		 System.out.println("Enter the 2nd num ");
		 n2=Sc.nextInt();
		 
		 if (n1==n2) {
			 System.out.println(" Both are equal numbers");
			 
		 }
		 else if (n1>n2){
			 System.out.println(n1+ " is larger than " +n2);
			 
		 }
		 else {
			 System.out.println(n2+ " is larger than  " +n1);
		 }

	}

}
