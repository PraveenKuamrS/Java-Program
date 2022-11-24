package com.edu;

public class StringReverseTest {
String a,b;
	public  String reverse(String a) {
		this.a=a;
		String b="";// 
		for(int i=a.length()-1;i>=0;i--) {
		 b=b+a.charAt(i);
		}
		return b;
	}
}
