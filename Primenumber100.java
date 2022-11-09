import java.util.Scanner;

public class Primenumber100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=Sc.nextInt();
		int count=0;
		int i,j;
		for (i=1;i<=num;i++) {
			for(j=1 ;j<=i;j++) {
				
				if (i%j==0)
				{
					count+=1;//count =count+1;
				}
			}
			if (count==2) {
				System.out.println(i);
				
			}
			count=0;
		}

	}

}
