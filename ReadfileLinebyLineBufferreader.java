package com.edu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadfileLinebyLineBufferreader {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("myfile.txt");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(fis));
		String s=null;
		while((s=br.readLine())!=null) {
			
		}
		System.out.println(s);
		}

}
