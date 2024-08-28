/*
 manual unboxing
*/
public class Ramu{
	public static void main(String args[]){
		Integer i = new Integer(89);
		Integer j = new Integer(11);
		int k = i+j;//Version 1.5 is only available for unboxing
		
		int a = i.intValue();
		int b = j.intValue();
		int c = a+b;//till 1.4 
		System.out.println(c);
		
		byte a = i.byteValue();
		byte b = j.byteValue();
		int  c = a+b;//adding Two byte values it becomes Integer value.
		System.out.println(c);
	}
}
