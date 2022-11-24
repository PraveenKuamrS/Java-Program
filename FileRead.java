package FileAsses;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f1=new FileInputStream("file1.txt");
		FileInputStream f2=new FileInputStream("file2.txt");
		FileInputStream f3=new FileInputStream("file3.txt");
		FileInputStream f4=new FileInputStream("file4.txt");
		
		FileOutputStream ob=new FileOutputStream("merge.txt");
		
		int i,j,m,n;
		while((i=f1.read())!=-1){
			ob.write(i);
			}
		while((j=f2.read())!=-1){
			ob.write(j);
		}
		while((m=f3.read())!=-1){
			ob.write(m);
		}
		while((n=f4.read())!=-1){
			ob.write(n);
		}
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		ob.close();
		System.out.println("return on merge file");
		System.out.println(i);
	}

}
