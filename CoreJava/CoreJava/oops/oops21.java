abstract class Raja{
	abstract void m2();
	static abstractvoid m2();//error
	final abstractvoid m2();//error
}
public class Ramu extends Raja{
	abstract void m2();//error
	public static void main(String args[]){
		Ramu r1=new Ramu();
		r1.m2();
		r1.m3();
	}
}