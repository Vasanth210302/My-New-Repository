/* 
   LinkedList
   
   its implements List as well as Queue.
   
   addFirst is not in ArrayList.
   LinkedList has List methods as well Queue methods.
 */
import java.util.LinkedList;
import java.util.List;
public class col10{
	
	public static void main(String args[]){
		LinkedList ll = new LinkedList();
	    ll.add("Raja");
	    ll.add(56);
	    ll.add(false);
	    ll.add(78.34f);
	    ll.add("Venkat");
	    System.out.println(ll);
		
		ll.addFirst("Tamil");//its goes 0 th index
		System.out.println(ll);
		
		ll.addLast("Vasanthakumar");//its goes last index
		System.out.println(ll);
		
		Object o = ll.getFirst();//returns first element
		String s = (String)o;
		System.out.println(o+" "+s);
		
		ll.offer("Gayu");//its assign value to the last.
		System.out.println(ll);
	}
} 