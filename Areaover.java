package com.edu;
class Area{
	void area(int l) {//square
		int a;
		a=l*l;
		System.out.println("Area of square " +l+ " is " +a);
	}
	void area(int l, int h) {
		int a;
		a=l*h;
		System.out.println("Area of rectangle " +l+ " and  "+h+ " is " +a);
	}
	void area(float base , float height) {// triangle
		float a;
		a=0.5f*base*height;
		System.out.println("Area of triangle " +base+ " and "+height+ "is " +a);
		
	}
}

public class Areaover {

	public static void main(String[] args) {
		Area ob=new Area();
		ob.area(8);
		ob.area(7, 7);
		ob.area(67.7f, 87.3f);


	}

}
