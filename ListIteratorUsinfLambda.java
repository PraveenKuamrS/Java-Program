package com.features;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIteratorUsinfLambda {

	public static void main(String[] args) {
	
		ArrayList<Integer> ob=new ArrayList<Integer>();
		
		for (int i=1; i<=10;i++) {
			ob.add(i); // add here 1 to 10
			
		}
 
		Iterator <Integer> it=ob.iterator()	;
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	
		// using lambda 
		ob.forEach(a -> System.out.print(a+" ")); // for each is the keyword
		System.out.println("");
		
		
ArrayList<String> ob1=new ArrayList<String>();
		
		ob1.add("praveen");
		ob1.add("karan");
		ob1.add("chan");
		
		ob1.forEach(b -> System.out.println(b ));
		
			
		
	}
}
