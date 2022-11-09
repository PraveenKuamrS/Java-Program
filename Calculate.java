import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		float ans;
		Scanner Sc=new Scanner(System.in);
		System.out.println("*********Menu*********");
		System.out.println("Enter your choice");
		System.out.println("1 . Addition");
		System.out.println("2 . Subtraction");
		System.out.println("3 . Multiplication");
		System.out.println("4 . Division");
		int ch =Sc.nextInt();
		System.out.println("Enter the two numbers");
	    float n1=Sc.nextFloat();
	    float n2=Sc.nextFloat();
	    switch(ch) {
	    case 1:ans=n1+n2;
	    System.out.println("sum of "+n1+ "and " +n2+ "is="+ans);
	    break;
	    case 2:ans=n1-n2;
	    System.out.println("Subtraction of "+n1+ "and " +n2+ "is="+ans);
	    break;
	    case 3:ans=n1*n2;
	    System.out.println("Multiplication of "+n1+ "and " +n2+ "is="+ans);
	    break;
	    case 4:
	    	if(n2!=0) {
	    	ans=n1/n2;
	    	System.out.println("Division of"+n1+ "and "+n2+"is="+ans);
	    }
	    	else {
	    		System.out.println("Division is zero error");
	    	}

	}

	}
}
