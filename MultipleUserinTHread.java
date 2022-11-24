package multithread;
class Table{
	// synchronized it will be give not allow other values 
	synchronized void methodPrint(int num) { // int num function with parameter
		for(int i=1;i<10;i++) {
			System.out.println(num+"x"+i+"="+num*i);//2x1=2......2x10=20
		}
	}
}

class MyThread1 extends Thread{
	Table top1;
  MyThread1(Table t){
	top1=t;	
	}
  public void run() {
	  top1.methodPrint(2); // want to perform fuction
  }
}
class MyThread2 extends Thread{
	Table top2;
  MyThread2(Table t){
		top2=t;
	}
  public void run() {
	  top2.methodPrint(5);
  }
}

public class MultipleUserinTHread {

	public static void main(String[] args) {
	    Table t=new Table();//object of table
		MyThread1 t1=new MyThread1(t);//object of thread1
		t1.setName("two");// it is name to start
		t1.start();
		
		MyThread2 t2=new MyThread2(t);//object of thread2
		t2.setName("six");
		t2.start();
	}
}
