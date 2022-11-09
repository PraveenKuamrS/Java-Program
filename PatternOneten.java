package assesment;

import java.util.Scanner;

public class PatternOneten {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int a=Sc.nextInt();
		int count=1;
		for (int i=1; i<=a; i++ ){
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
		}
	}

}
