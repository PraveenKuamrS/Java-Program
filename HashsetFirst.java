package set.edu;

import java.util.HashSet;

public class HashsetFirst {

	public static void main(String[] args) {
		HashSet<Integer> hob=new HashSet<Integer>();
        hob.add(90);
        hob.add(82);
        hob.add(45);
        hob.add(90);
        hob.add(63);
        hob.add(null);
        
        System.out.println(hob);
	}

}
