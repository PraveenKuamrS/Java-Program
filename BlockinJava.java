package com.edu;

public class BlockinJava {

	//public static void main(String[] args) {
		static {
			System.out.println("static block will execute before the main");
		}
		{
		    System.out.println("Annonymous block will execute before constructor call");	
		}
		BlockinJava(){
			System.out.println("Constructor block will execute on Object creation");
		}
		void display() {
			System.out.println("Display method ");
		}
		
		public static void main(String[] args) {
			System.out.println("Main method");
			BlockinJava ob =new BlockinJava();
            ob.display();
		}

	

	
		
}
	
