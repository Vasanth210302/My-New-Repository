/* 
  
 */
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class file3{
	public static void main(String args[]){
		
		File f = new File("xyz.txt");
		boolean b = false;
		try{
			b = f.createNewFile();
		}
		catch(IOException e){
			System.out.println(e);
		} 
		System.out.println(b);
		FileWriter fw= null;
		try{
			fw = new FileWriter(f);
		}
		//i can call all the methods which are all presents in
		//fill writer class and super class
		try{
			fw.write("Hai Vasanth, How are you");
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		try{
			fw.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}