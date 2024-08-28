/* 
   Vector
   
   -> its implements List interface.
   -> its equalent to ArrayList.
   -> Vector is synchronized.(its slow process).
   -> 10 is initialCapacity.
   -> once 10 elements are filled then it automatically create another 10.
 */
import java.util.ArrayList;
import java.util.Vector;
public class col12{
	
	public static void main(String args[]){
		Vector v = new Vector();
		int c = v.capacity();
		System.out.println(c);//10
		ArrayList al = new Arraylist();
	}
} 