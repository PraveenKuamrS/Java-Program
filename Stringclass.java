package com.edu;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="Praveen";
		String name2="Kumar";
		
		// no of charcter
		int l=name1.length();
		System.out.println("No of character ="+l);
		System.out.println("First character ="+name1.charAt(0));
		System.out.println("First character ="+name1.charAt(4));
		String fname= name1+" "+name2;// with space use this method
		System.out.println("Full name ="+fname);
		
		
		String fn =name1.concat(name2);//without space use this method
		System.out.println("Full name ="+fn);
		
		System.out.println(" Lower case=" +name1.toLowerCase());
		System.out.println(" Lower case=" +name2.toUpperCase());
		
		// substring
		// name = Praveen 
		       // 0123456
		          System.out.println("Substring(2,4) ="+name1.substring(2,4));
		          System.out.println("Substring(2) ="+name1.substring(2));
		          
		          
		
		 }

}
