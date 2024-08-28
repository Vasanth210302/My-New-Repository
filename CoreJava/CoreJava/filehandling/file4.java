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
		
		File f = new File("col22.java");
		boolean b = f.createNewFile();
		System.out.println(b);
		FileWriter fw = new FileWriter(f);
		fw.write
		("import java.util.*;"+"\n"+
		"public class col22{"+"\n"+
			"public static void main(String args[]){"+"\n"+
				"System.out.printn();"+"\n"+
			"}"+"\n"+
		"}");
		fw.close();
		
	}
}