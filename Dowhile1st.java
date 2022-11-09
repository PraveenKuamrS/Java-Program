package Do;

public class Dowhile1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		while(i>10){ //pre check //entry control
			//i=i-1;
			System.out.println("Inside while loop");
			
		}
		System.out.println("outside while loop");
		
		//do while ->exit control
		
		do {
			System.out.println("inside do while");
		}while(i>10);
		System.out.println("outside do-while loop");


	}

}
