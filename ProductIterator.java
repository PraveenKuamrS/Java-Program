package com.edu;
import java.util.ArrayList;
import java.util.Iterator;

class product{
	int pid;
    String pname;
    float pamount;
	public product(int pid, String pname, float pamount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pamount = pamount;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", pamount=" + pamount + "]";
	}
    
}
public class ProductIterator {

	public static void main(String[] args) {
		
		ArrayList<product> ptlist=new ArrayList<product>();
		
		product p1= new product(24, "cup", 35.00f);
		product p2= new product(25, "ball", 30.00f);
		product p3= new product(26, "tin", 350.00f);
		
		//ArrayList<product> ptlist;
		ptlist.add(p1);
		ptlist.add(p2);
		ptlist.add(p3);
		
System.out.println(ptlist);

//iterator 

Iterator<product> pt=ptlist.iterator();
System.out.println("PID\tPNAME\tPAMOUNT");
while(pt.hasNext()) {
	product pob=pt.next();
	System.out.println(pob.pid+"\t"+pob.pname+"\t"+pob.pamount);
}

	}

}
