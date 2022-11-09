package whileloop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int num,i;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
        num=Sc.nextInt();
        double f=1;//int this take small numbes only
        while(num>=1) {
        	f=f*num;
        	num=num-1;
        	 
        }
        System.out.println(" factorial of=" +f);
	}

}
