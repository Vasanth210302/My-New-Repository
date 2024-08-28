/* 
  FileReader
 */

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class file6{
	static void writing()throws IOException{
		File f = new File("xyz.txt");
		boolean b = f.createNewFile();
		System.out.println(b);
		FileWriter fw = new FileWriter(f);
		fw.write("Vasanth is a Engineer");
		fw.close();
		
	}
	static void reading()throws IOException{
		File f = new File("xyz.txt");
		FileReader fr = new FileReader(f);
		char A[] = new char[100];
		fr.read(A);
		System.out.println(A);
	}
	public static void main(String args[])throws IOException{
		
		writing();
		reading();
	}
}