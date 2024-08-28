/* 
*/

import java.util.HashSet;
public class col18{
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
	}
}
