/* 
    Collections is the class.
    There are no construtor.
    All the methods are static.
   
						List (I)
						
						
		ArrayList		LinkedList			Vector
 */
 
/* 
interface List{
	
}
class ArrayList implements List{
	
}
class Collections{
	static void sort(List list){
		
	}
	
}
class Raja{
	public static void main(String args[]){
		Collections.sort(new ArrayList());
		or
		ArrayList al = new ArrayList();
		Collections.sort(al);
	}
}
 */
import java.util.Collections;
import java.util.ArrayList;
public class col15{
	public static void main(String args[]){
		ArrayList al = new ArrayList();
		al.add("Raja");
		al.add("Mani");
		al.add("Tamil");
		al.add("Ramu");
		System.out.println(al);
		//Collections.sort(list);
		//but we have ArrayList
		//we can send subclass object.
		//sort is an Static method.
		Collections.sort(al);
		System.out.println(al);
	}
}