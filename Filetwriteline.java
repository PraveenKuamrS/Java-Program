package FileAsses;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filetwriteline {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream f2=null;
		
	/*	f2.write(112);//112=p
		f2.write(114);//114=r
		f2.write(97);
		f2.write(118);
		f2.write(101);
		f2.write(101);
		f2.write(110);  */
		
		try {
			
			f2=new FileOutputStream("file1.txt");
			f2.write(112);//112=p
			f2.write(114);//114=r
			f2.write(97);
			f2.write(118);
			f2.write(101);
			f2.write(101);
			f2.write(110);
			f2.write(32);// space axy no 32
			
			f2=new FileOutputStream("file2.txt");//siva
			f2.write(83);
			f2.write(72);
			f2.write(73);
			f2.write(86);
			f2.write(65);
			f2.write(32);
			
			f2=new FileOutputStream("file3.txt");//punam
			f2.write(80);
			f2.write(85);
			f2.write(78);
			f2.write(65);
			f2.write(77);
			f2.write(32);
			
			f2=new FileOutputStream("file4.txt");//mukta
			f2.write(77);
			f2.write(85);
			f2.write(75);
			f2.write(84);
			f2.write(65);
			f2.write(32);
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
			f2.close();
		}
		
		System.out.println("writen text");
	}

}
