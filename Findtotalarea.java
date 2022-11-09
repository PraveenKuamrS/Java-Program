package assesment;

import java.util.Scanner;

public class Findtotalarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ans;
		int sel;//select
		Scanner Sc=new Scanner(System.in);
		System.out.println("----Menu----");
		System.out.println("Enter your choice");
		System.out.println("1.Rectangle");
        System.out.println("2.square");
		System.out.println("3.Triangle");
		System.out.println("4.Circle");
		sel=Sc.nextInt();
		
		
		if(sel==1) {
			System.out.println("Enter your length");
	    	float len=Sc.nextFloat();
			System.out.println("enter your width");
			float wid=Sc.nextFloat();
			ans=len*wid;
			System.out.println("This is your total Area of Rectangle is : " +ans);
			
		}
		else if(sel==2) {
			System.out.println("Enter your one side of  square  ");
			float A=Sc.nextFloat();
			ans=A*A;
			System.out.println("This is your total Area of Square is :" +ans);
			
			
		}
		else if (sel==3) {
			System.out.println("Enter your half of breath");
			float halfb=Sc.nextFloat();
			System.out.println("Enter your height");
			float height=Sc.nextFloat();
			ans=(halfb*height)/2;
			System.out.println("This is your total Area of Triangle is : " +ans);
					}
		
		else if(sel==4) {
			System.out.println("Enter your radius of circle");
			float R=Sc.nextFloat();
			ans=3.14f*R*R;
			System.out.println("This is your total Area of Circle is : "+ans);
		
		}
		else {
			System.out.println("Invalid Input");
		}
		
		
	}

}
