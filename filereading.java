
package FileAsses;

import java.io.FileInputStream;

public class filereading {

	public static void main(String[] args) {
		
		try{
			FileInputStream fin=new FileInputStream("merge.txt");
			int i=0;
			while((i=fin.read())!=-1){ //gives byte value ascii value
				                         //-1 to check end of file in java
				System.out.print((char)i); //Welcome to Edubridge
			}
			fin.close();
		} catch(Exception e){
			System.out.println(e);}

	}

}
