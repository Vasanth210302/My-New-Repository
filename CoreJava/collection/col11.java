/* 
   LinkedList
   
   its implements List as well as Queue.
   
   addFirst is not in ArrayList.
   LinkedList has List methods as well Queue methods.
 */
import java.util.LinkedList;
import java.util.List;
public class col11{
	
	public static void main(String args[]){
		LinkedList ll = new LinkedList();
	    ll.add("Raja");
	    ll.add(56);
	    ll.add(false);
	    ll.add(78.34f);
	    ll.add("Venkat");
	    System.out.println(ll);
		
		Object o = ll.peek();//returns first element but doesnot remove
		//peekFirst();its also same as peek();
		System.out.println(o);
		System.out.println(ll);
		
		Object o1 = ll.peekLast();
		//returns last element but doesnot remove
		
		Object a = ll.poll();
		//returns and remove first element
		//ll.pollFirst(); same as above
		//ll.pollLast();
		//returns and remove last element
		System.out.println(a);
		System.out.println(ll);
		/* 
			remove();//removes first Element
			removeFirst();
			removeLast();
			remove(Object);//remove the element 
			removeFirstOccurrence(Object);
		*/
	}
} 