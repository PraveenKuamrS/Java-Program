package map;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
class phonenumber{
	long pnum;
	String name;
	/*public phonenumber(long pnum, String name) {
		super();
		this.pnum = pnum;
		this.name = name;
	}
	@Override
	public String toString() {
		return "phonenumber [pnum=" + pnum + ", name=" + name + "]";
	}*/
	
}
public class TreeMapPhneNumber {

	public static void main(String[] args) {
		LinkedHashMap<Long, String> tm=new LinkedHashMap<Long, String> ();
		
        tm.put(1236547891L,"Praveen");
        tm.put(3659874155L,"shiva");
		tm.put(8610636998L,"gokul");
		tm.put(3214563984L,"kanni");
		
		System.out.println(tm);
		
		// iterator//Set<entry<k,v>>ident=mapobj.entryset();
		Set<Entry<Long, String>> ent= tm.entrySet();
		for (Entry<Long,String> ent1:ent) {
			System.out.println(ent1.getKey()+"==> "+ent1.getValue());
			
		}
	}

}
