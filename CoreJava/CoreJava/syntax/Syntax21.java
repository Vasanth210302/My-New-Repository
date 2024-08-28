/* 
 */
 //4 th
 class Syntax21{
	int g=54;
	void m1(){
		System.out.println("Wow");
	}
	void m2(){
		System.out.println("Good");
		m1();
		System.out.println(g);
	}
	public static void main(String args[]){
		Syntax21 r=new Syntax21();
		r.m2();
		System.out.println("Well");
	}
 }