import java.util.Scanner;
 
public class LinearmamExpalin {

	
		int a[]=new int[5];
		int key, pos;
		
		//input data
		 void inputData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter "+a.length+" elements");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();  //5 7 8 9 1->array elements
			}
			
			System.out.println("Enter search element");
			key=sc.nextInt();   //key=8
		}
		
		void searchMethod() {
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==key) {
					pos=(i+1);
					break;
				}
				
			}
			
			if(pos>0){
				System.out.println("Successful search");
				System.out.println(key+" found at "+pos+" position");
			}
			else {
				System.out.println("unsuccessful search");
				System.out.println(key+" not found in an array");
			}
	}
	


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearmamExpalin ob= new LinearmamExpalin ();
		ob.inputData();
		ob.searchMethod();


	}

}
