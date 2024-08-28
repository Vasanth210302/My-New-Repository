/* 
    Integer i = new Integer(12);
    Integer j = new Integer(23);
	
	Statck memory i -->    12 - Heap memory -> IntegerObject
	              j -->    23 - Heap memory -> IntegerObject
				  
	Wrapping -> Boxing -> autoBoxing 
*/
public class Ramu{
	public static void main(String args[]){
		Integer i = new Integer(89);
		Integer j = new Integer(11);
		int k = i+j;//Version 1.5 is only available for unboxing
		System.out.println(k);
	}
}
