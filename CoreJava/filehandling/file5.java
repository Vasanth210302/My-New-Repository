/* 
  FileWriter
 */

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class file5{
	static void writing()throws IOException{
		File f = new File("xyz.txt");
		boolean b = f.createNewFile();
		System.out.println(b);
		FileWriter fw = new FileWriter(f);
		fw.write("Vasanth is a Engineer");
		fw.close();
		
	}
	public static void main(String args[])throws IOException{
		//we use either throws IOException or try catch.
		writing();
		
		try{
			writing();
		}
		catch(IOException e){
			System.out.println(e);	
		}
	}
}