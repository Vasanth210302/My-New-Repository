/* 
	Vector -> iterator, elements(Enumeration)
	ArrayList -> iterator.
    Itrator -> its used both ArrayList and Vector.
 */
import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;
public class col14{
	
	public static void main(String args[]){
		ArrayList v = new ArrayList(5);
		//Vector v = new Vector(5);
		v.add("Raja");
		v.add("Raja");
		v.add("Raja");
		v.add("Raja");
		v.add("Raja");
		v.add("Raja");
		
		Iterator i = v.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
	}
} 