package com.edu.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employees{
	int eid, eage;
	String ename;
	public Employees(int eid, int eage, String ename) {
		super();
		this.eid = eid;
		this.eage = eage;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", eage=" + eage + ", ename=" + ename + "]";
	}
}
	 class SortAge implements Comparator<Employees>{

		@Override
		public int compare(Employees o1, Employees o2) {
			if(o1.eage<o2.eage) 
		      return-1;
		      else if(o1.eage>o2.eage) 
		    	  return 1;
			return 0;
		}
	}
	

public class Employee {

	public static void main(String[] args) {
		
		ArrayList<Employees> eob=new ArrayList<Employees>();
		Employees e1=new Employees( 1, 23, "shiva");
		Employees e2=new Employees( 2, 22, "mon");
		Employees e3=new Employees( 3, 21, "pm");
		Employees e4=new Employees( 7, 27, "pk");
		
		eob.add(e1);
		eob.add(e2);
		eob.add(e3);
		eob.add(e4);
		
		System.out.println(eob);
		
		SortAge eage=new SortAge();
		Collections.sort(eob,eage);
		System.out.println("After sortage");
		System.out.println(eob);
		
		// iterator
		Iterator<Employees> it=eob.iterator();
		System.out.println("EID\tEAGE\tENAME");
		while(it.hasNext()) {
		Employees eob1=it.next();
		System.out.println(eob1.eid+"\t"+eob1.eage+"\t"+eob1.ename);
		}
	}

}
