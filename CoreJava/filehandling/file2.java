/* 
  Either throws IOException or try catch block must be used.

 */
import java.io.File;
import java.io.IOException;
public class file2{
	public static void main(String args[])throws IOException{
		//File f = new File();//error
		//there is no empty constructor
		
		File f = new File("xyz2.txt");
		boolean b = false;
		//b = f.createNewFile();
		try{
			b = f.createNewFile();
		}
		catch(IOException e){
			System.out.println(e);
		} 
		System.out.println(b);
	}
}