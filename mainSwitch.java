package Switch;

import java.util.Scanner;

public class mainSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day;
		Scanner Sc=new Scanner(System.in);
		System.out.println(" Enter the number");
		day=Sc.nextInt();//enter 1 to 7 numbers
		
		switch(day) {
		case 1: System.out.println(" Monday : 1st day of week");
		        break;
		case 2: System.out.println(" Tuesday : 2nd day of week");
                break;
		case 3: System.out.println(" Wednesday : 3rd day of week");
        break;
		case 4: System.out.println(" Thursday : 4th day of week");
        break;
		case 5: System.out.println(" Friday : 5th day of week");
        break;
		case 6: System.out.println("Saturday : 6th day of week");
        break;
		case 7: System.out.println(" sunday : 1st day of week");
        break;
        default :System.out.println("Invalid point");
		
		}
		
	}

}
