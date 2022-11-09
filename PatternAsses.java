package assesment;

import java.util.Scanner;

public class PatternAsses {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int b=1;b<=r-i;b++) { //3-1=2(1step)   3-2=1(2step) 3-3=0
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

	}


