//i was edit this one for test gitbash work or not

package assesment;

import java.util.Scanner;

abstract class calculator {
	 abstract void ans (float a, float b);
	 void display() {
		 System.out.println(" Your final output ");
	 }	 
	 }
	 class addition extends calculator{
		
		void ans(float a, float b) {
		float c=a+b;
		System.out.println("The addition of "+a+ "and "+b+ "is ="+c);
		};
	 
	 }	
	 class subtraction extends  calculator{

		@Override
		void ans(float a, float b) {
			float c=a-b;
			System.out.println("The subtraction of "+a+ "and "+b+ "is ="+c);
		}
		 
	 }
	class multiplication extends calculator{

		@Override
		void ans(float a, float b) {
			float c=a*b;
			System.out.println("The multiplication of "+a+ "and "+b+ "is ="+c);
			
		}
		
	}
	class division extends calculator{

		@Override
		void ans(float a, float b) {
			float c=a/b;
			System.out.println("The division of "+a+ "and "+b+ "is ="+c);
		}
		
	}
	class modulo extends calculator{

		@Override
		void ans(float a, float b) {
			float c=a%b;
			System.out.println("The modulo of "+a+ "and "+b+ "is ="+c);
			
		}
		
	}



public class AbstractCal {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the values");
		float a=Sc.nextFloat();
		float b=Sc.nextFloat();
		calculator ob;
		 ob =new addition();
		 ob.display();
		 ob.ans(a, b);
		 ob =new subtraction();
		 //ob.display();
		 ob.ans(a, b);
		 ob =new multiplication();
		// ob.display();
		 ob.ans(a, b);
		 ob =new division();
		// ob.display();
		 ob.ans(a, b);
		 ob =new modulo();
		// ob.display();
		 ob.ans(a, b);
			
		
	}

}
