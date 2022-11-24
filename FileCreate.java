package FileAsses;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("merge.txt");
		
		if(f1.createNewFile())  {
			System.out.println("File is created");
		
		}
		else {
			System.out.println("File is already exits");
		}

	}

}