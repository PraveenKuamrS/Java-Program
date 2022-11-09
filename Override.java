package Overiding;


class Employee{
	public void display() {
		System.out.println("Dislay  method of employee");
		
	}
}
class HRemployee extends Employee{
	public void display() {
		System.out.println("Display method of HRemployee");
		super.display();
	}
}

public class Override {

	public static void main(String[] args) {
		HRemployee hob=new HRemployee();
		hob.display();
	}

}
