package com.edu;
class Product{
	int pid;
	String pname;
    float pprice;
    
    Product(){// constructor use to initialse the variable of class
    pid=8;
    pname="gokul";
    pprice=333.78f;
    }
    Product(int i, String s,float f){
    	pid=i;
    	pname=s;
    	pprice=f;
    }
    
    void display() {
    	System.out.println("Product id ="+pid);
    	System.out.println("Product name ="+pname);
    	System.out.println("Product price= "+pprice);
    }
    
}


public class Constructor {

	public static void main(String[] args) {
		Product ob=new Product();
		System.out.println("pid=" +ob.pid);
		System.out.println("pname=" +ob.pname);
		System.out.println("pprice="+ob.pprice);
		
		
		Product ob1=new Product(10,"Pk",98.90f);
		ob.display();
		ob1.display();
		//System.out.println("pid=" +ob1.pid);
		//System.out.println("pname="+ob1.pname);
		//System.out.println("pprice="+ob1.pprice);
		
	}

}
