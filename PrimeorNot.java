import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc=new Scanner(System.in);
        while(true) {
        
       
        System.out.println("Enter the number");
		int num=Sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)//1%3=
			{
				count+=1;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is Prime");
		}
		else
		{
			System.out.println(num+" is not an prime");
		}
		System.out.println("Do you want check any other number yes / no");
		char ch=Sc.next().charAt(0);
		if(ch=='n') {
			break;
		}

	}
        System.out.println("Exit the program");

}
}
