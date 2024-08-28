/* 
   ArrayList are unsynchronized 
   if multiple threads access an ArrayList instance concurrently.
 */
import java.util.ArrayList;
import java.util.List;
public class col9 extends ArrayList{
	//ArrayList al = new ArrayList();
	//unsynchronized
	
	public static void main(String args[]){
		List al = Collections.synchronizedList(new ArrayList(...));
	    //synchronized
	    //List is superclass 
		
	    al.add();
	    System.out.println(al);
	}
}  
/* 
  Either throws IOException or try catch block must be used.

 *//* 
import java.io.File;
import java.io.IOException;
public class col9{
	public static void main(String args[])throws IOException{
		//File f = new File();//error
		//there is no empty constructor
		
		
		for(int i=22;i<=37;i++){
			File f = new File("col"+i+".java");
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
}  */