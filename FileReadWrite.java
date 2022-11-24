package com.edu;// read from oher file

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream ob =new FileInputStream("myfile.txt");
		FileOutputStream ob1=new FileOutputStream("file.txt");
		
		int i=0;
		while((i=ob.read())!=-1){
		
			ob1.write(i);
			
		}
		System.out.println("new copy file");
		ob.close();
		ob1.close();

	}

}
