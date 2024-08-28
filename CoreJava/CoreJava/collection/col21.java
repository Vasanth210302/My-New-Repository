/* 
    LinkedHashSet
	
	LinkedHashSet class is a HashTable and LinkedList implementation
	of the set interface.
	
	-> This class only accepts unique elements like hashSet.
	-> This class provides all optional set operation and permits null.
	-> This is non-synchronized class
	-> It maintains insertion order.
	
	-> There is no method in LinkedHashSet so we call HashSet methods.
	-> The difference is it maintains insertion order
	   whereas hashSet was not.
*/

import java.util.LinkedHashSet;
import java.util.Iterator;
public class col21{
	public static void main(String args[]){
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("Raja");
		hs.add(45);
		hs.add(67.8f);
		hs.add('k');
		hs.add(new col18());
		hs.add("Raja");//its not allowed.
		hs.add(null);
		System.out.println(hs);
	
	}
}
