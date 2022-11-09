package assesment;

import java.util.Scanner;

public class PatternOnetoTenTriangle {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			//int temp=a;
			int count=1;
			for(int i=1;i<=a;i++)
			{
			    for(int j=a;j>i;j--)// this loop foe spaces
			    {
			        System.out.print(" ");
			    }
			    for(int j=1;j<=i;j++)
			    {
			        System.out.print(count+" ");
			        count++;
			    }
			    System.out.println();
			}
		}

	}


