import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Array1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int s = 0;
int ar[]=new int[5];

Scanner Sc=new Scanner(System.in);
System.out.println("Enter the 5 array elements");

 for (int i=0;i<ar.length;i++) {
	 ar[i]=Sc.nextInt();//ar[i] is store multiple elements
 }
 System.out.println("Array elements are");
 for(int i=0;i<ar.length;i++) {
	 System.out.println(ar[i]);
 }
 int s=0;
 for(int i=0;i<ar.length;i++) {
	  s=s+ar[i];
	 // System.out.println(" sum "+s); it print sum sum so use close braket
 }
 System.out.println(" sum "+s);
 float avg=(float)s/ar.length;
 System.out.println("Average "+avg);
 
 // find maximum of all array elements
 
 int max=ar[0];
 for (int i=1;i<ar.length;i++) {
	 if (ar[i]>max) {
		 max=ar[i];
		 
		 
	 }
 }
 System.out.println("Largest of all array elements ="+max);
 
 
 // minimum
 int min=ar[0];
 for (int i=1;i<ar.length;i++) {
	 if (ar[i]<min) {
		 min=ar[i];
		 
		 
	 }
 }
 System.out.println("minimum  of all array elements ="+min);
 
 
 
 
 
 
	}

}
