package map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1111,"pk");
		tm.put(1113,"shiva");
		tm.put(1112,"gokul");
		System.out.println(tm);

		// iterator
		Set<Entry<Integer, String>> ent=tm.entrySet();
		for(Entry<Integer, String> ent1:ent) {
		
		System.out.println(ent1.getKey()+"==>" +ent1.getValue());
			
		}
				
	}

}
