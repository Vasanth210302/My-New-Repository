/* 
	TreeSet is automatically Sorted.
	
	headSet -> returns potion of this set whose elements are strictly
			   less than toElement.
			   
	SortedSet ss = headSet(E toElement);
*/

import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Iterator;
public class col24{
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

		SortedSet ss = ts.headSet("Ramu");
		System.out.println(ss);
		//[Appa, Gayu, Raja]
	}
}