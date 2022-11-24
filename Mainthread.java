// on way create thread
package multithread;
class MyThread extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {// for loop it gives output not constant
		System.out.println("In side run method "+Thread.currentThread());
	   
		try {
			Thread.sleep(5000);// gives output delay 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}


public class Mainthread {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread "+Thread.currentThread());
		MyThread ob = new MyThread();//want to change thread name ob.StName("firstnme")
		ob.setName("Firstnmae");
		ob.start();
		ob.join();// this keyword use to firsr execute after execute others
		//remove that join it will be run  mixed
		
		MyThread ob1 = new MyThread();
		ob1.start();

	}	

}
