/* 
   set -> replacing
   size -> returns int 
   toArray -> Object[]
   its accepts null
*/

import java.util.ArrayList;
public class col6{
	public static void main(String args[]){
		ArrayList al = new ArrayList(6);
		al.add(34);//Integer
		al.add(45.6f);//Float
		al.add('H');//Character
		al.add("Vasanthakumar");
		al.add(false);//Boolean
		
		System.out.println(al);
		
		al.set(3,"Vasanthakumar S");
		System.out.println(al);
		//size
		int k = al.size();
		System.out.println(k);
		
		//toArray
		Object[] x = al.toArray();
		for(int i=0;i<k;i++){
			System.out.print(x[i]+" ");
		}
		al.add(null);
		System.out.println(al);
	}
}