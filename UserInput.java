// program for user input
package userinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		int age;
		float fees;
		String name;
		String gen;// use char it give onnly one letter
		
		Scanner sc= new Scanner(System.in);
		// user input
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the age ");
		age=sc.nextInt();
		System.out.println("Enter the fees");
		fees=sc.nextFloat();
		System.out.println("Enter the gen");
		gen=sc.next();//.charAt(0);
		
		//display
		System.out.println("Enter the Name is" +name);
		System.out.println("Enter the age is" +age);
		System.out.println("Enter the fees is" +fees);
		System.out.println("Enter the gen is" +gen);
		

	}

}
