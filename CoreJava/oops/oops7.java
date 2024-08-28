/* 
 2. multi level inheritance
 */
 class Tamil{
	int a=45;
	void m1(){
		System.out.println("Good");
	}
 }
 class Raja extends Tamil{
	int b=34;
	void m2(){
		System.out.println("Nice");
	}
 }
 class Ramu extends Raja{
	int c=48;
	void m3(){
		System.out.println("Wow");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.c);
		System.out.println(r.m1());
		System.out.println(r.m2());
		System.out.println(r.m3());
	}
 }