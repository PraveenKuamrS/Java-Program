package com.edu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionIteratorString {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("kiran");
		list.add("Praveen");
		list.add("Shiva");
		
		System.out.println(list);
		
		Collections.sort(list);
		// try with iterator
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
		System.out.println(it.next() +" " );
		
		
	}
		// try with suffle
		Collections.shuffle(list);
		System.out.println("First shuffle");
		System.out.println(list);
		
		
}
}