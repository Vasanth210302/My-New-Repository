/* 
 Wrapper Classes:
    
 */
class Raja extends Object{
	int y;
	void m1(){
		System.out.println("Good");
	}
	public String toString(){
		return ""+y;
	}
	Raja(int k){//k=34
		y=k//y=34
	}
}
public class Ramu{
	public static void main(String args[]){
		Integer i = new Integer(34);
		//this also call the toString method from Integer class
		System.out.println(i);//34
		Raja r = new Raja(34);//This calls the construtor
		System.out.println(r);//34
		//object reference will invoke/call toString method.
	}
}