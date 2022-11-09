// program for find largest numbers 
package conditionalstatement;

import java.util.Scanner;
class Largest{
	int a,b,c;

	void inputData(){
    Scanner Sc=new Scanner (System.in);
		
		System.out.println("Enter 3 number ");
		a=Sc.nextInt();
		b=Sc.nextInt();
		c=Sc.nextInt();
	} 
	
	void performlargest() {
    if (a>b && a>c) {
			
			System.out.println("The largest of "+a+" ,"+b+" ,"+c+"is "+a) ;
			
		}
		else if(b>a && b>c){
			System.out.println("The largest of "+a+" ,"+b+" ,"+c+"is "+b) ;
			
		}
		else {
			System.out.println("The largest of "+a+" ,"+b+" ,"+c+"is "+c) ;
		}
		

	}

}
	
		
	public class Largestof3numbers {

	public static void main(String[] args) {
		// driver program
		Largest ob=new Largest();
		
		ob.inputData();
		ob.performlargest();
	}
	}
		

		
		
	
		
	
		
		
