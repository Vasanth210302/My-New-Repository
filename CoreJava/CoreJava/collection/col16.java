/*  
interface List{
	
}
class ArrayList implements List{
	
}
class Collections{
	static void reverse(List list){
		
	}
	
}
class Raja{
	public static void main(String args[]){
		Collections.reverse(new ArrayList());
		or
		ArrayList al = new ArrayList();
		Collections.reverse(al);
	}
}

*/

import java.util.Collections;
import java.util.ArrayList;
public class col16{
	public static void main(String args[]){
		ArrayList al = new ArrayList();
		al.add("Raja");
		al.add("Mani");
		al.add("Tamil");
		al.add("Ramu");
		System.out.println(al);
		//Collections.reverse(list);
		//but we have ArrayList
		//we can send subclass object.
		//reverse is an Static method.
		Collections.reverse(al);
		System.out.println(al);
	}
}