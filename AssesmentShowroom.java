package assesment;

import java.util.Scanner;

class Showroom{
	String name;
	long mobileno;
	double cost,discount,amount;
 
	void inputData() {
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the name");
	name=Sc.next();
	System.out.println("Enter the mobileno");
    mobileno= Sc.nextLong();
    System.out.println("Enter the cost");
    cost=Sc.nextDouble();
  //  System.out.println("Enter the discount");
  //  discount=Sc.nextDouble();
  //  System.out.println("Enter the amount");
   // amount=Sc.nextDouble();
	}
    
    void calculate() {
    	if (cost<=10000) {
    		discount =(cost*5)/100;
    		amount = (cost -  discount);
            System.out.println("The total cost of " +name+ " with discount amount is ="  +amount );
    	}
    	else if (cost>10000 && cost<=20000 ) {
    		discount =(cost*10)/100;
    		amount = (cost -  discount);
    		System.out.println("The total cost of " +name+ " with discount amount is ="  +amount );
    		
    	}
    	else if (cost>20000 && cost<=35000) {
    		discount =(cost*15)/100;
    		amount = (cost -  discount);
    		System.out.println("The total cost of " +name+ " with discount amount is ="  +amount );
    		
    	}
    	else {
    		discount =(cost*20)/100;
    		amount = (cost -  discount);
    		System.out.println("The total cost of " +name+ " with discount amount is ="  +amount );
    		
    		
    	}
    	
    }
   
    	
    }
 
    	
    

public class AssesmentShowroom {

	public static void main(String[] args) {
		Showroom ob=new Showroom();
		ob.inputData();
		ob.calculate();
		
		
		
		

	}

}
