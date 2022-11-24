package com.edu;

 
class Product{
	int pid;
	String pname;
	public static Product pob;
	private Product() {
		pid =0;
		pname=null;
		
	}
	public static Product getProductObject() {
		if (pob==null) {
			pob=new Product();
			System.out.println("Object created ="+pob);
			
		}
		else {
			return pob;
		}
		return pob;
		
	}
	void display() {
		System.out.println("Display method");
		
	}
}
public class SingleTon {

	public static void main(String[] args) {
		
		//Product ob=new Product();
		 Product p1=Product.getProductObject();
		System.out.println("the objec in main "+p1);
		p1.display();
	}

}
