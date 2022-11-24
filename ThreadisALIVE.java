package multithread;

class Myclass1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class ThreadisALIVE {

	public static void main(String[] args) throws InterruptedException {
		
		Myclass1 ob=new Myclass1();
	     Thread tob=new Thread(ob);//new state
	     
	     tob.setName("First");
	     System.out.println("Is First Thread is alive ="+tob.isAlive()); //false
	       tob.start(); //
	       System.out.println("Is First Thread is alive ="+tob.isAlive());//true
	       tob.join();
	       System.out.println("Is First Thread is alive ="+tob.isAlive());
	       Myclass1 ob1=new Myclass1();
	       Thread tob1=new Thread(ob1);
	       System.out.println("Is Second Thread is alive ="+tob1.isAlive());
	       tob1.setName("Second");
	     //  System.out.println("Is Second Thread is alive ="+tob1.isAlive());
	       tob1.start();
	       System.out.println("Is Second Thread is alive ="+tob1.isAlive());
	}
    
}


