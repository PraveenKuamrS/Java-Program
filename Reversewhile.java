package whileloop;

import java.util.Scanner;

class Reverse{
	int num,rev,t;
	void inputNum() {
		Scanner Sc=new Scanner(System.in) ;
		System.out.println("Enter the numbers");
		num=Sc.nextInt();
		t=num;
		}
	void ReverseNumber() {
		
		
		while (num>0) {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
			
		}
		System.out.println("reversed number is="+rev);
		
	}
	void checkpallandrome(){
		if(t==rev) {
		System.out.println(t+  "  is pallandrome");	
		}
		else {
			System.out.println(t+ "  is not pallandrome");
		}
	}
}

public class Reversewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse ob=new Reverse();
		ob.inputNum();
		ob.ReverseNumber();
		ob.checkpallandrome();

	}

}
