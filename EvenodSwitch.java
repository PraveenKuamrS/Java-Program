package Switch;

import java.util.Scanner;
 


public class EvenodSwitch {

	public static void main(String[] args) {
		int num;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=Sc.nextInt();
		int b=a%2;
		switch(b) {
		case 0 :System.out.println("This is odd number "+a);
		break;
		case 1:System.out.println("This is even number " +a);
		break;
		default : System.out.println("Invalid Number");
		}
		
		
	
		          

	}

}
