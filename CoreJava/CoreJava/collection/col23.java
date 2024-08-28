/* 
	TreeSet is automatically Sorted.
	
	descendingIterator -> Iterator
	
*/

import java.util.TreeSet;
import java.util.Iterator;
public class col23{
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

		Iterator i = ts.descendingIterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
	}
}