/* 
  Raja <- Ramu -single level inheritance
 */
 class Raja{//super or parent or base
	int a=10;
	void m1(){
		System.out.println("Good");
	}
}
class Ramu extends Raja{//sub or child or derived
	int b=23;
	void m2(){
		System.out.println("Wow");
	}
	public static void main(String args[]){
		//Raja r1=new Raja();
		Ramu r2=new Ramu();
		System.out.println(r2.a);
		r2.m1();
		System.out.println(r2.b);
		r2.m2();
	}
}=