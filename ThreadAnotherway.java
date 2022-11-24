package multithread;

class myclass implements Runnable{

	@Override
	public void run() {
for(int i=1;i<=5;i++) {
	System.out.println(Thread.currentThread());
	
try {
	Thread.sleep(2000);
}
catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	}
	
}


public class ThreadAnotherway {

	public static void main(String[] args) throws InterruptedException {
		myclass ob=new myclass();
		
		Thread tob=new Thread(ob);
		tob.setName("Praveen");
		
		tob.start();// use start to st
		tob.join();
		myclass ob2=new myclass();
		Thread tob1=new  Thread(ob2);
		
		tob1.start();
		tob1.join();
}

}
