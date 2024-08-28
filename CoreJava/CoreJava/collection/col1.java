/* 
    Collection is a frameWork
	    Its accepts only the object.
		It will not accept primitive data types.
		Its converts the data types into the Wrapper class.
		(Auto Boxing)
		
    same order or in sequence
	10 initial size
	it accepts duplicate & null
	this is the roughly equivalent to vector,
	except that it is unsynchronized.

    Collection is the interface 
	Collections is the class.
*/
import java.util.ArrayList;
public class col1{
	public static void main(String args[]){
		ArrayList al = new ArrayList();
		//we should have empty constructor.
		al.add(34);//Integer
		al.add(45.6f);//Float
		al.add('H');//Character
		al.add("Vasanthakumar");
		al.add(false);//Boolean
		al.add(new col1());
		//if toString method is not overrided then
		//hashcode of the object will be printed.
		//else the return statement of toString method is printed.
		System.out.println(al);
	}
}