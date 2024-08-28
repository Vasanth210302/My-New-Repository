/* 
	TreeSet class will give the result as ascending order.
	Its accepts only Generic Type of elements.
	Its doesnot accepts duplicate.
*/
import java.util.TreeSet;
public class col28{
	public static void main(String args[]){
		/* TreeSet ts = new TreeSet();
		ts.add(24);//Integer
		ts.add(24.56f);//Float
		ts.add("Raja");//String
		System.out.println(ts);
		//it gives Exception */
		
		TreeSet ts = new TreeSet();
		ts.add(24);//Integer
		ts.add(243);//Integer
		ts.add(876);//Integer
		System.out.println(ts);
		
	}
}