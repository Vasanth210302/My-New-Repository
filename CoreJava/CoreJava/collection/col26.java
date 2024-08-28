/* 
	ArrayList -> only getting single object 
				like Integer only.(GenericArray)
				
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	-> Its used for sorting purpuse.
	-> Its apt for all the classes belongs to List.

*/
import java.util.ArrayList;
public class col26{
	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<Integer>();
		//al.add("Raja");//String Object
		//al.add(false);//Boolean Object
		//al.add('R');//Character Object
		//al.add(new col26());//Object
		
		
		al.add(56);//Integer Object
		al.add(987);//Integer Object
		al.add(9);//Integer Object
		
		System.out.println(al);
		
	}
}