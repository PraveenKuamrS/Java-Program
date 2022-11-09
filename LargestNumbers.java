//largest numbers program
package largestnumbers;

public class LargestNumbers {

	public static void main(String[] args) {
		int  a,b,c,large;
		a=5;
		b=8;
		c=9;
		large=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
		System.out.println("The largest number is="  +large );

	}

}
