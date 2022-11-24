package multithread;

class Table1{
	// synchronized it will be give not allow other values 
	synchronized void methodPrint(int num) { // int num function with parameter
		for(int i=1;i<10;i++) {
			System.out.println(num+"x"+i+"="+num*i);//2x1=2......2x10=20
		}
	}
}
public class AnotherWayThreadMultipleUse {

	public static void main(String[] args) {
		
		Table1 t=new Table1();
		
		//Annonymous inner  class
		Thread tob=new Thread() {
			
			public void run() { // run meyhod
				t.methodPrint(4);
			}
			
		};
		tob.start();
		
       Thread tob1= new Thread() {
			
			public void run() {
				t.methodPrint(8);
			}
			
		}; // 
		tob1.start();
		

	}

}

		
	


