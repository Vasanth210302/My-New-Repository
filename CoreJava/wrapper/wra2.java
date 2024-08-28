/* 
 Wrapper Classes:
    this is the final methods.
	Its not allowed inherit.
 */
class Raja{
	void m1(){
		System.out.println("Good");
	}
	Raja(int k){
		
	}
}
public class Ramu{
	public static void main(String args[]){
		Integer i = new Integer(34);
		System.out.println(i);//34
		Raja r = new Raja(34);
		System.out.println(r);//Raja@hashcode
	}
}