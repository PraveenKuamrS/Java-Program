package assesment;

import java.util.Scanner;

class Bankbalance extends Exception{
	Bankbalance( String s){
		super(s);
	}
}
class withdraw{
	void withdrawl( int a,int  b){
		try {
			if(a>b) throw new Bankbalance(" Your bank balance is low");
			
		}
		catch(Bankbalance e) {
			e.printStackTrace();
		}
		System.out.println("colloect your amount");
	}
}

public class CustomExceptionBank {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the withdraw amount");
		int a=Sc.nextInt();
		int b=10000;
	   withdraw ob =new withdraw();
	   ob.withdrawl(a, b);
	}

}
