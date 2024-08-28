/* 
    it will accept all objects..
	add(E e)
	//E is the Object class
	//e is subclass object
*/
import java.util.ArrayList;
public class col2{
	public static void main(String args[]){
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("36");//Integer
		//add method only gets object.
		//36 is converted to object via wrapper class.
		al1.add("45.6");//Float
		al1.add("H");//Character
		al1.add("Vasanthakumar");
		
		for(String a : al1){
			System.out.println(a);
		}
	}
}