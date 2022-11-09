package com.edu;

public class Checkwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Gokulkannan and Praveenkumar ";
		String st= "kannan ";
		String st1 = "Praveen";
		System.out.println("kannan is there = " +name.contains(st));
		System.out.println("Praveen is there ="+name.contains(st1));
		
		
System.out.println("Position  of e ( left to right)= " +name.indexOf('e'));
System.out.println("Last index of e (right to left)=" +name.indexOf('e'));

// replace

System.out.println(" Replace e with a="  +name.replace('e','a'));
System.out.println("Repace Praveen with Gokul=" +name.replace('r','n'));


// reverse 

 StringBuffer sb=new StringBuffer(st);
 StringBuffer sb1=new StringBuffer(st1);
 System.out.println(sb.reverse());
 System.out.println(sb1.reverse());
 
 // append
StringBuffer s =new StringBuffer(st);

 System.out.println( s.append("  new " ));

 
 

	}
	

}
