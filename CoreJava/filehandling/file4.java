/* 

 */

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class file4{
	//if that is checked exception thenn only we put throws
	//either throws or try catch is posible
	//whether that is uncheckd exception then we use only try catch
	public static void main(String args[])throws IOException{
		
		File f = new File("xyz.txt");
		boolean b = f.createNewFile();
		System.out.println(b);
		FileWriter fw = new FileWriter(f);
		fw.write("I am Vasanthakumar");
		fw.close();
		
	}
}