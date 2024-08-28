/* 
   contains -> returns boolean value
   get -> returns object 
   indexOf -> returns int
   remove 
*/

import java.util.ArrayList;
public class col4{
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
		boolean b = al.contains('H');
		System.out.println(b);//true
		
		Object o = al.get(1);
		//its return the object we convert into float.
		System.out.println(o);
		float f = (float)o;
		//type casting.
		System.out.println(f);
		//another method.
		char c = (char)al.get(2);
		System.out.println(c);
		
		int k = al.indexOf(false);//object
		System.out.println(k);
		
		int k1 = al.lastIndexOf("Vasanthakumar");
		System.out.println(k1);
		
		Object o1 = al.remove(7);
		System.out.println(al);//alterd list
		System.out.println(o1);//Vasanthakumar
	}
}