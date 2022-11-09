import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIteratorString {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("kiran");
		list.add("Praveen");
		list.add("Shiva");
		
		System.out.println(list);
		
		
		// try with iterator
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
		System.out.println(it.next() +" " );
		
	}

}
}