package set.edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetArray {

	public static void main(String[] args) {
		
		Set<Integer> hob=new HashSet<Integer>();
		hob.add(89); //1. no duplicate values, 2. 
		              //2 .Insertion order not maintained 3.add null values
		
		hob.add(90);
		hob.add(65);
		hob.add(65);
		hob.add(89);
		hob.add(null);
		System.out.println(hob);
		
		// after removing the duplicate value
		ArrayList<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(13);
		lst.add(19);
		lst.add(12);
		System.out.println(lst);
		Set<Integer> lst1=new HashSet<Integer>(lst);
		System.out.println("After remove duplicate bvalues :"+lst1);
	}

}
