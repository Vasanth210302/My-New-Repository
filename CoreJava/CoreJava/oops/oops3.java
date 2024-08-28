class Raja{
	int a=10;
	void m1(){
		System.out.println("Good");
	}
}
class Ramu{
	int b=23;
	void m2(){
		System.out.println("Wow");
	}
	public static void main(String args[]){
		Raja r1=new Raja();
		Ramu r2=new Ramu();
		System.out.println(r1.a);
		r1.m1();
		System.out.println(r1.b);
		r2.m2();
	}
}