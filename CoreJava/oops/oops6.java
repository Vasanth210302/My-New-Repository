/* 
   2.multi level inheritance
   
   Tamil <- Raja <- Ramu
 */
 class Tamil{
	int a=12;
	void m1(){
		System.out.println("Good");
	}
 }
 class Raja extends Tamil{
	int b=25;
	void m2(){
		System.out.println("nice");
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
		//r.b,r.c,r.m1();r.m2();r.m3();
	}
 }