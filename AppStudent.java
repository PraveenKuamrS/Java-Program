package com.edu;
import java.util.ArrayList;
import java.util.Iterator;

class StudentDetails{
	int  sid;
	String sname;
	float sfees;
	public StudentDetails(int sid, String sname, float sfees) {
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
	
		ArrayList<StudentDetails> slist=new ArrayList<>();
		StudentDetails s1=new StudentDetails(1,"praveen",1000f);
		StudentDetails s2=new StudentDetails(2,"venilla",2000f);
		StudentDetails s3=new StudentDetails(3,"monish",3000f);
		StudentDetails s4=new StudentDetails(4,"rajendar",4000f);
     /* student s1=new student(1,"Praveenk",45555.30f);
      student s2=new student(2,"venilla",75555.30f);

      student s3=new student(3,"monish",655855.30f);

      student s4=new student(4,"rajendar",25555.30f);*/

slist.add(s1);
slist.add(s2);
slist.add(s3);
slist.add(s4);


System.out.println(slist);

// iterator

Iterator<StudentDetails> st=slist.iterator();
System.out.println("SID\tSFEES\t\tSNAME");
while(st.hasNext()) {
	StudentDetails sob=st.next();
	System.out.println(sob.sid+"\t"+sob.sfees+"\t\t"+sob.sname);
}
	
	}
}
