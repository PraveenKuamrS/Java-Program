package com.edu;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionIteratorFloat {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		float val=0;
		ArrayList<Float> list=new ArrayList<Float>(); 
		System.out.println("Enter the elements");
		float n=Sc.nextInt();
		for(int i=0;i<n; i++) {
			
		
		System.out.println("Enter the values");
		//float a=Sc.nextFloat();
		//float b=Sc.nextFloat();
		
		//list.add( a);
		//list.add( b);
		val=Sc.nextFloat();
		list.add(val);
		}
		
		System.out.println(list);
		// iterator
		Iterator<Float> it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() +" ");
			
			// remove
	
		}
		System.out.println();
		System.out.println("The remove value is " +list.remove(3));
		//System.out.println);
		
		//
	}

}
