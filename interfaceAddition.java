package com.features;
@FunctionalInterface
interface Addition{ 
	void add(int a, int b);
	
	default void method() {
		System.out.println("Default method ");
		
		
	}
	
	static void smethod() {
		System.out.println("Interface static method");
	}

}
@FunctionalInterface
interface Multipication{
	int prod(int a, int b);
}

@FunctionalInterface
interface Subtraction {
	int sub(int a, int b);
}
@FunctionalInterface
interface SayHello{
	String disp(String s);
}

public class interfaceAddition {

	public static void main(String[] args) {/// mainclass
		
	
		Addition ob =( a, b) ->  { // using lamba close with semicolon
			
	
		int s=a+b;
		System.out.println("sum="+s);
		};
		ob.add(4, 8);
		ob.method();
		Addition.smethod(); // tocall static to use interface class name 
		
		
		
		// predefined interface runnable
		
		Runnable rob=()->{
			System.out.println("run method is called");
		};
		Thread tob=new Thread(rob);
		tob.start();
		
		
		////////////
	/*	Multipication mob=(int a,int b)->{  
			int p;
			p=a*b;
			return p;  */ 	Multipication mob=(int a,int b)->(a*b);  //this is one line code
		//};
		
		int ans;
		ans=mob.prod(3, 9);
		System.out.println("product="+ans);
		
		
		////sub
		Subtraction sob=( a, b) -> (a-b);
		//ans=sob.sub(9,1);
		//System.out.println("subtraction ="+ans);
		System.out.println("Subratcion ="+sob.sub(9,1));
		
		// string
		
		SayHello ob1=(s)->(s);  // s is the input 
		
		
		System.out.println(" Hello="+ob1.disp("Praveen"));
		
	}
	

}
