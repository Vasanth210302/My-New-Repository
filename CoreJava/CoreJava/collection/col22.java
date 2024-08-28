/* 
	TreeSet
	Set -> SortedSet -> TreeSet 
	
	->	It accepts unique elements like HashSet.
	->	This class access and retrived times are quite fast.
	->	This class doesnot allow null elements.
	->	This class is non-synchronized.
	->	This class gives/maintains the elements in ascending order.
*/

import java.util.TreeSet;
import java.util.Iterator;
public class col22{
	public static void main(String args[]){
		TreeSet ts = new TreeSet();
		ts.add("Raja");
		ts.add("Venkat");
		ts.add("Vasanth");
		ts.add("Gayu");
		ts.add("Ramu");
		ts.add("Appa");
		System.out.println(ts);
	}
}