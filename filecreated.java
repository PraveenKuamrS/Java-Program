package com.edu;

import java.io.File;
import java.io.IOException;

public class filecreated {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Creating a file");
		File myfile=new File("edubrindcont.txt");
		
		if(myfile.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File already exits");
		}
		

	}

}
