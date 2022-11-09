package whileloop;

import java.util.Scanner;

public class whilereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		num=sc.nextInt();//234
		//to get last digit use % division
		int d;
		/*d=num%10;
		System.out.print(d); //4
		num=num/10;//23
		d=num%10; 
		System.out.print(d);//3
		num=num/10; //23/10=2
		d=num%10;//2
		System.out.print(d);
		num=num/10; //2/10 ,num=0
		*/
		
		while(num!=0) {
			d=num%10;
			System.out.print(d);
			num=num/10;
		}



	}

}
