/* 
 Wrapper classes are final classes so it cant to be inherited.
*/
public class Ramu{
	public static void main(String args[]){
		Integer i = new Integer(89);
		Integer j = new Integer("11");
		//string convert into int value automatically.
		//it can be convert as Integer(parsable integer).
		int k = i+j;//
		System.out.println(k);
		
		String a = "12";
		String b = "23";
		String c = a+b;
		System.out.println(c);
		
		
		Integer i = new Integer(a);
		Integer j = new Integer(b);
		int k= i+j;
		System.out.println(k);
	}
}