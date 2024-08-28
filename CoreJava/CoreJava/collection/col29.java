/* 
		Hashmap
	
	->	contains value based on the key.
	->	it contains any unique keys.
	->	it may contain one null key and multiple null elements.
	->	HashMap class is non-synchronized.
	->	This class doesnot maintain the order.
	->	initial capacity would be 16.
*/
import java.util.HashMap;
public class col29{
	public static void main(String args[]){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Raja");
		hm.put(2,"Ramu");
		hm.put(3,"Venkat");
		hm.put(4,"Vasanth");
		hm.put(5,"Tamil");
		hm.put(6,"Gayu");
		System.out.println(hm);
		//{1=Raja, 2=Ramu, 3=Venkat, 4=Vasanth, 5=Tamil, 6=Gayu}
		
		System.out.println(hm.entrySet());
		//convert to List.
		//[1=Raja, 2=Ramu, 3=Venkat, 4=Vasanth, 5=Tamil, 6=Gayu]
	}
}
