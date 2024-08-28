/* 
  iterator -> returns Iterator 
*/

import java.util.HashSet;
import java.util.Iterator;
public class col19{
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
		
		Iterator g = hs.iterator();
		while(g.hasNext()){
			System.out.print(g.next()+" ");
		}
	}
}
