package Typesofvariables;

public class MamEmployee { // Mamexplain use this bcoz this is mam program {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		                  
		 int b; //instance variable
		  static int c=10; //static variable
		   
		  void display(){
			  int k;//local 
		     System.out.println("b="+b);//default value is zero
		     System.out.println("static data c="+c);
		     //System.out.println("local variable k="+k); error local variables are not initialized
		   }
		   public static void main(String args[]){
		      //variable declared in the main or any other method is called local variable
		       int a=10; //a is called local variable
		       
		       Employee eob=new Employee();//creating an object
		       
		       System.out.println("b="+eob.b);//default value is zero
		       
			     System.out.println("static data c="+Employee.c);
			     System.out.println("static data c="+eob.c);
			     System.out.println("static data c="+c);

	}

}
