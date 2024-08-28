/* 
	TreeSet is automatically Sorted.
	
	tailSet -> returns potion of this set whose elements are strictly
			   greater than or equal to fromElement.
			   
	SortedSet ss = ts.tailSet(E fromElement);
	
	subSet -> returns portion of this set Between fromElement to 
			  less than toElement.
			  
	SortedSet ss = ts.subSet(E fromElement,E toElement);
*/

import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Iterator;
public class col25{
	public static void main(String args[]){
		TreeSet ts = new TreeSet();
		ts.add("Raja");
		ts.add("Venkat");
		ts.add("Vasanth");
		ts.add("Gayu");
		ts.add("Ramu");
		ts.add("Appa");
		System.out.println(ts);
		//[Appa, Gayu, Raja, Ramu, Vasanth, Venkat]

		SortedSet ss = ts.tailSet("Ramu");
		System.out.println(ss);
		//[Ramu, Vasanth, Venkat]
		
		SortedSet sub = ts.subSet("Appa","Vasanth");
		System.out.println(sub);
		//[Appa, Gayu, Raja, Ramu]
	}
}