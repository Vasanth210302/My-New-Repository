abstract class Raja{
	int a=45;
	void m1(){//normal method
		System.out.println("Good");
	}
	
}
class Ramu extends Raja{
	int b=29;
	public static void main(String args[]){
		Ramu r1=new Ramu();
		System.out.println(r1.b);
		//Raja r2=new Raja();//Error
		System.out.println(r1.a);
		r1.m1();
	}
}
//
abstract class Raja{
	abstract void m2();
	void m3(){
		System.out.println("Good");
	}
}
class Ramu extends Raja{
	void m2(){
		System.out.println("Wow");
	}
	public static void main(String args[]){
		Ramu r1=new Ramu();
		r1.m2();
		r1.m3();
	}
}