package com.edu;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int ar[]= {1,4,6,5};
		int ar1[]=ar.clone();
		
		System.out.println("Elements of copied array");
		System.out.println( +ar1[0]+" "+ar1[1]+" "+ ar1[3]+" "+ ar1[2]);

	    int ar2[]= {1,4,3};
	  int ar3[]=ar2.clone();
	  System.out.println("Elements of copied aray");
	  System.out.println(+ar3[0]+" "+ar3[1]+" "+ar3[2]);
	
	
	
	}

}
