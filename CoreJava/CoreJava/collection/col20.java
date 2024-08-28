/* 
  remove
  contains
  clear
*/

import java.util.HashSet;
import java.util.Iterator;
public class col20{
	public static void main(String args[]){
		HashSet hs = new HashSet();
		hs.add("Raja");
		hs.add(45);
		hs.add(67.8f);
		hs.add('k');
		hs.add(new col18());
		hs.add("Raja");//its not allowed.
		hs.add(null);
		System.out.println(hs);
		
		hs.remove('k');
		System.out.println(hs);
		
		boolean b = hs.contains('k');
		System.out.println(b);
		
		hs.clear();
		System.out.println(hs);
	}
}
