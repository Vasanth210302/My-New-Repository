/* 
   remove -> index , Object
   
*/

import java.util.ArrayList;
public class col5{
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
		
		
		Object o1 = al.remove(7);
		System.out.println(al);//alterd list
		System.out.println(o1);//Vasanthakumar
		
		al.remove("Vasanthakumar");
		System.out.println(al);
	}
}