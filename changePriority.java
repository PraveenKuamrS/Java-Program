package multithread;

class threadclass extends Thread{
	public void run() {
		System.out.println("run method called "+Thread.currentThread()); 
	}
}
public class changePriority {

	public static void main(String[] args) {
		
		threadclass th=new threadclass();
		th.setPriority(6);// 1 to 10 only taken threadset
		System.out.println("Thread priority"+th.getPriority());
	    th.start();
	
	threadclass th1=new threadclass();
	th1.setPriority(Thread.MAX_PRIORITY);
	th1.setPriority(2);
	System.out.println("Thread priority"+th1.getPriority());
	th1.start();
	}

}


