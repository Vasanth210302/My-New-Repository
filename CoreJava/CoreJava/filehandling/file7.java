/* 
  BufferedWriter
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file7{
	
	
	public static void main(String args[])throws IOException{
		
		FileWriter fw = new FileWriter("testout.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Vsanthakumar living in Salem");
		bw.close();
	}
}