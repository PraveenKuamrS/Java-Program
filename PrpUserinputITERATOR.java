package com.edu;
import java.util.ArrayList;
import java.util.Scanner;
class Product1{
	int pid;
	String pname;
	float pamount;
	public Product1(int pid, String pname, float pamount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pamount = pamount;
	}
	
	  public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pamount=" + pamount + "]";
	}
	
}

public class PrpUserinputITERATOR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Product1> lst=new ArrayList<Product1>();
		System.out.println("Enter The Limit");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter ID");
			int a=in.nextInt();
			System.out.println("Enter Product Name");
			String s=in.next();
			System.out.println("Enter The Price");
			float f=in.nextFloat();
			Product1 pr=new Product1(a,s,f);
			lst.add(pr);
			System.out.println(lst);
		}
		
		//Iterator<Product> it=lst.iterator();
	}

}
