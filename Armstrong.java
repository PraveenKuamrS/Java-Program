package assesment;


import java.util.Scanner;

class Armstrongnum{
	int num,d,sum,t;
	
	Scanner Sc=new Scanner(System.in);
	
	void input() {
		System.out.println("Enter the numbers");
		 num=Sc.nextInt();
		
		
	}
	void calculate() {
	t=num;
	
	while(num>0); {
	    d=num%10;
		sum=sum+d*d*d;
		num=num/10;
		
 
		    
	if (t==sum) {
			System.out.println("The given number is Armstrong= " +sum);
		}
		else if(t!=sum) {
			System.out.println("The given number is  NOT Armstrong= " +sum);
			
		}
			
		
	}	
	
	
	}
}

public class Armstrong {

	public static void main(String[] args) {
 Armstrongnum ob =new Armstrongnum();
 ob.input();
 ob.calculate();




	}

}
