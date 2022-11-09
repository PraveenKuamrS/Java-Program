import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter array limit ");
	
		 int limit=Sc.nextInt();
		int ar[]=new int[limit];// get multiple numbers
		System.out.println("Enter the array elements");//0,1,2,3,4
		for(int i=0;i<limit;i++) {                     //5,6,7,8,9
			ar[i]=Sc.nextInt();
		}
		System.out.println("Enter the element");//10
		 int ele=Sc.nextInt();
		for( int i=0;i<limit;i++) {
			if(ar[i]==ele) {
				flag=i;
				break;
				
			}
		}
		if(flag==0) {
		
		System.out.println("Element not found");
	

	}
		else {
			System.out.println("Succesful search" );
			System.out.println(ele+ " is presnt position is " +flag);
		}
}
}