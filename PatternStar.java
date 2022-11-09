package practice;

import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc=new Scanner(System.in);
	   System.out.println("enter the your figure");
	    String figure=Sc.next();
	    //int term=5;
	    for( int i=5;i>=1;i--) {
	    	
	    	for(int j=1;j<=i;j++) {//
	    		
	    		System.out.print(figure+ ", ");
	    	}
	    	System.out.println();
	    }
	    
	}    

}
