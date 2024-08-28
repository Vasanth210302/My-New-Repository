/* 
    ArrayList li = new ArrayList();
	it calls empty constructor Arraylist()
	it means constructs an empty list with initial capacity of ten.
	its cover 10 elements then it automatically grow up 5 spaces.
	its accepts duplicate.
	its print as same order.
	
	ArrayList li = new ArrayList(6);
	its calls ArrayList(int initialCapacity) this constructor.
	it means constructs an empty list with initial capacity of 6.
	its cover 6 elements then it automatically grow up another 6 spaces.
*/
import java.util.ArrayList;
public class col3{
	public static void main(String args[]){
		ArrayList al = new ArrayList(6);
		al.add(34);//Integer
		al.add(45.6f);//Float
		al.add('H');//Character
		al.add("Vasanthakumar");
		al.add(false);//Boolean
		al.add(new col3());
		al.add(98765);
		al.add("Vasanthakumar");
		System.out.println(al);
		al.add(6,"Tamil");
		//inserts the spacific position.
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}
}