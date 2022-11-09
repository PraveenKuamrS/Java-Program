package assesment;

import java.util.Scanner;

public class PatternTiangleReverse {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int a=Sc.nextInt();
		//int count=1;
		for (int i=a; i>=1; i--) {
			
			for(int j=a; j>i;j--) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			
			
			System.out.println();
		}

	}

}
/*int row=7;  
for (int i= row; i>= 1; i--)  
{  
for (int j=row; j>i;j--)  
{  
System.out.print(" ");  
}  
for (int k=1;k<=i;k++)  
{  
System.out.print("*");  
}  */