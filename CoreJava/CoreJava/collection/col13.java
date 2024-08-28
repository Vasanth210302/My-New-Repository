/* 
   Vector(5)
   
   -> 5 is initialCapacity.
   -> once 5 elements are filled then it automatically create another 5.
   
   Vector(5,2)
   
   -> 5 is initialCapacity.
   -> once 5 elements are filled then it automatically create another 2.
 */
import java.util.ArrayList;
import java.util.Vector;
import java.util.Enumeration;
public class col13{
	
	public static void main(String args[]){
		Vector v = new Vector(5);
		v.add("Raja");
		v.add("Raja");
		v.add("Raja");
		v.add("Raja");
		v.add("Raja");
		v.add("Raja");
		int c = v.capacity();
		System.out.println(c);//10
		
		Vector v1 = new Vector(5,2);
		v1.add("Raja");
		v1.add("Raja");
		v1.add("Raj");
		v1.add("Raja");
		v1.add("Raja");
		v1.add("Raja");
		int c1 = v1.capacity();
		System.out.println(c1);//7
		
		Object o = v1.elementAt(2);
		String s = (String)o;
		System.out.println(s);
		
		Enumeration x = v1.elements();
		while(x.hasMoreElements()){//its return boolean
			System.out.print(x.nextElement()+" ");
		}
		
	}
} 