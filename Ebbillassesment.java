package assesment;

import java.util.Scanner;


	



public class Ebbillassesment {

	public static void main(String[] args) {
		String name;
		int consumerno;
		float UC,amount;// UC-units consumed
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter your Consumer number ");
		consumerno=Sc.nextInt();
		
		System.out.println("Enter the  Name ");
	    name=Sc.next();
		System.out.println("Enter the Units Consumed");
		UC=Sc.nextFloat();
		
		if(UC<=100) {
			amount=UC*1.25f;
			System.out.println("The ConsumerNo is "+consumerno+ ",Name:"+name+",UnitsConsumed "+UC+",Amount:"+amount );
			
				
		}
		else if(UC<=200) {
			amount=UC*1.50f;
			System.out.println("The ConsumerNo is "+consumerno+ ",Name:"+name+",UnitsConsumed "+UC+",Amount:"+amount );
			
		}
		else if(UC>200) {
			amount=UC*1.80f;
			System.out.println("The ConsumerNo is "+consumerno+ ",Name:"+name+",UnitsConsumed "+UC+",Amount:"+amount );
		}
		}
	
		
		
		

	}


