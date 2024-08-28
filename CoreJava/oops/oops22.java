abstract class Raja{
	abstract void m1();
	public abstract void m2();
}
abstract class Tamil extends Raja{
	void m1(){
		System.out.println("Good");
	}
	void m2(){
		System.out.println("Good m2");
	}
	abstract void m3();
}
public class Ramu extends Tamil{
	void m3(){
		System.out.println("Good m3");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		
	}
}