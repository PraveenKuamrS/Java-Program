import java.util.ArrayList;
import java.util.Iterator;

class student{
	int  sid;
	String sname;
	float sfees;
	public student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", snmae=" + sname + ", sfees=" + sfees + "]";
	}
	
	
}
public class AppStudent {

	public static void main(String[] args) {
	
		ArrayList<student> slist=new ArrayList<student>();
      student s1=new student(23,"Praveen", 45555.30f);
      student s2=new student(23,"venilla", 75555.30f);

      student s3=new student(23,"monish", 655855.30f);

      student s4=new student(23,"rajendar", 25555.30f);

slist.add(s1);
slist.add(s2);
slist.add(s3);
slist.add(s4);


System.out.println(slist);

// iterator

Iterator<student> st=slist.iterator();
System.out.println("sid\tsname\tsfees");
while(st.hasNext()) {
	student sob=st.next();
	System.out.println(sob.sid+"\t"+sob.sname+"\t"+sob.sfees);
}
	
	}
}
