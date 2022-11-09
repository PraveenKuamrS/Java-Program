package assesment;

import java.util.Scanner;

class EBbill{
	String name,coach;
	long mobno;
	int amount,totalamount,ch;
	void accept() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=Sc.next();
		//System.out.println("Enter the coach");
		//coach=Sc.next();
		System.out.println("Enter the mobno ");
    	mobno=Sc.nextLong();
		//System.out.println(" Enter the amount");
		//amount=Sc.nextInt();
    	System.out.println("The fixed amount is 200");
    	amount=200;
		System.out.println("*********Menu*********");
		System.out.println("1. First_Ac = 700");
		System.out.println("2. Second_Ac= 500");
		System.out.println("3. Third_Ac= 250");
		//System.out.println("4. Sleeper= 0");
		System.out.println("Enter your choice");
		ch=Sc.nextInt();
	}
		
	void update() {
		if (ch==1) {// (coach.equals("First_Ac"))
			
			totalamount=700+amount;
			System.out.println("The passenger name of " +name+ "choose First_Ac, so toatl amount is="+totalamount);
		}
		else if (ch==2) {//(coach.equals("First_Ac"))
			
	 	     totalamount=500+amount;
			System.out.println("The passenger name of " +name+ "choose Second_Ac, so toatl amount is="+totalamount);
		}
		else if (ch==3) {//(coach.equals("Third_Ac"))
		
			totalamount=250+amount;
			System.out.println("The passenger name of " +name+ "choose Third_Ac, so toatl amount is="+totalamount);
		}
		/*else {
			int Sleeper=0;
			totalamount=+amount+Sleeper;
			System.out.println("The passenger name of " +name+ "choose Sleeper, so toatl amount is="+totalamount);
		}*/
			
		
	}
}
public class Railway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBbill ob=new EBbill();
		ob.accept();
		ob.update();
		


	}


}

