/* 
	if you enter duplicate then its replace by last inserting element
	
	hm.put(2,"Ramu");
	hm.put(2,"Gayu");//its replaced
*/

import java.util.HashMap;
public class col30{
	public static void main(String args[]){
		//generic
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Raja");
		hm.put(2,"Ramu");
		hm.put(3,"Venkat");
		hm.put(4,"Vasanth");
		hm.put(2,"Gayu");//its replaced
		System.out.println(hm);
		//{1=Raja, 2=Gayu, 3=Venkat, 4=Vasanth} 
		
		//hytrogenious
		HashMap hm1 = new HashMap();
		hm1.put(1,"Raja");
		hm1.put(24.5f,'k');
		hm1.put('V',23);
		hm1.put(null,"Vasanth");
		hm1.put(false,"Gayu");
		System.out.println(hm1);
		//{null=Vasanth, 1=Raja, 24.5='k', false=Gayu, V=23}
		
		hm1.put(9,null);
		hm1.put('B',null);
		//its also possible.
	}
}
