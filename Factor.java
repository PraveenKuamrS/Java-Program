import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num=Sc.nextInt();
		for(int i=1;i<=num;i++) {
			if (num%i==0)
			 {
				System.out.println(i);
			}
		}
		
	}

}
