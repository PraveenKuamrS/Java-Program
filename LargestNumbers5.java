// program for largest 5 numbers
package largestnumbers;

public class LargestNumbers5 {

	public static void main(String[] args) {
		int a,b,c,d,e,large;
		a=9;
		b=8;
		c=7;
		d=5;
		e=2;
		large=(a>b&&a>c&&a>d&&a>e)?a:(b>a&&b>c&&b>d&&b>e)?b:(c>a&&c>b&&c>d&&c>e)?c:(d>a&&d>b&&d>c&&d>e)?d:e;
		System.out.println("The largest number of "+a+","+b+"," +c+"," +d+"," +e+ ",is=" +large);
		

	}

}
