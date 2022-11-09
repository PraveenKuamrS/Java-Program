package com.edu;
class Addition{
	void add(int i ,int j) {
	int s;
	s=i+j;
	System.out.println("sum of 2 int values "+i+ " and "+j+ " is ="+s);
	}
	void add(float i, float  j) {
		float s;
		s=i+j;
		System.out.println("sum of 2 float values "+i+ " and "+j+ " is ="+s);
		
	}
	void add( double i, double j) {
		double s;
		s=i+j;
		System.out.println("sum of 2 double values "+i+ " and "+j+ " is ="+s);
	}
	void add(byte i, byte j) {
		byte s;
		s=(byte)(i+j);
		System.out.println("sum of 2 byte values "+i+ " and " +j+ " is =" +s);
	}
	void add(long i, long j) {
		long s;
		s=(long)(i+j);
		System.out.println("sum of 2 long values "+i+ " and " +j+ " is =" +s);
	}
	void add(short i, short j) {
		short s;
		s=(short)(i+j);
		System.out.println("sum of 2 short values "+i+ " and " +j+ " is =" +s);
	}
	
}

public class Sumoverload {

	public static void main(String[] args) {
	Addition ob=new Addition();
	ob.add(4,  7);
	ob.add(67.53f,61.20f);
	ob.add(24.61, 58.5);
	ob.add((byte)2, (byte)6);
	ob.add(76l ,89l);
	ob.add((short)62 , (short)8);
	

	}

}
