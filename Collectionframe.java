package com.edu;
import java.util.ArrayList;
import java.util.Iterator;

public class Collectionframe {

	public static void main(String[] args) {
	
		int a[]=new int[4];
		
     ArrayList<Integer> list=new   ArrayList<Integer>();
     list.add(56);
     list.add(56);
     list.add(89);
     
     System.out.println(list);
     
     System.out.println(list.contains(89));// boolean just true or false 
     
     // add one moreb list
     ArrayList<Integer> list1=new   ArrayList<Integer>();
     list1.add(568);
     list1.add(565);
     list1.add(894);
     
     list.addAll(list1);
     System.out.println(list);
     
     Iterator<Integer> it=list.iterator();
     
     while(it.hasNext()) {// hasnext itvis boolean contion
    	 System.out.print(it.next() +" ");// need space so use " " 
     }
     
	}

}
