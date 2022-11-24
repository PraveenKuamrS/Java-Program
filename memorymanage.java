package MemoryManagement;

public class memorymanage {

	int i;
	String s;
	memorymanage(){
		i=90;
		s="Hllo";
	}
	public static void main(String[] args) {
		
		System.out.println("MAin Method");
		memorymanage ob=new memorymanage();
		System.out.println("ob="+ob);
		System.out.println(ob.i);
		System.out.println(ob.s);
		System.out.println(ob.hashCode());//to find exact location
		ob=null; // remove null you not finalize
		System.gc();// garpage collector
		System.out.println("ob="+ob);
		//System.out.println(ob.i);
		//System.out.println(ob.s);
		
	}
@Override
	public void finalize() {
		System.out.println("finalize method is caled become null ");
	}
}
