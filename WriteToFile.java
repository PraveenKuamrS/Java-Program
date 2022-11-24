package com.edu;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos =null;
		try {
			fos= new FileOutputStream("myfile.txt");
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.write(69);
			fos.write(70);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fos.close();
			
		}
		System.out.println("Written to the file");
	}

}
