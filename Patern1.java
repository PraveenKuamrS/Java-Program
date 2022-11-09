import java.util.Scanner;

public class Patern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row;
		int count = 3;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the input values");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int c=Sc.nextInt();
		int ar[] = new int[3];
		ar[0]=a;
		ar[1]=b;
		ar[2]=c;
		for(int z=0; z<3; z++) {
			row=ar[z];
			for (i=0; i<row; i++)   
			{        
				for (j=row-i; j>1; j--)   
				{    
					System.out.print(" ");   
				}   
				for (j=0; j<=i; j++ )   
				{   
					System.out.print((i+1)+" ");   
				}   
				System.out.println();   
			}   
		}
		
	}

}
