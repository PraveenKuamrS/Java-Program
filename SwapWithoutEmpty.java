//program for swaping without empty
package data;

public class SwapWithoutEmpty {

	public static void main(String[] args) {
		int a,b;
		a=5;
		b=10;
		System.out.println("before swaping a is="+a);
		System.out.println("before swaping b is="+b);
		a=a+b;
		b=a-b;
		a=b-a;
		System.out.println("After swaping a is="+a);
		System.out.println("After swaping b is="+b);

	}

}
