interface A{
	void m1();
}
interface B{
	void m2();
}
class Ramu implements B,A{
	public void m1(){
		System.out.println("Good");
	}
	public void m2(){
		System.out.println("very Good");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m1();
		r.m2();
	}
}
/*  A->I    B->I
   implements
      Ramu 
	
	
	A -> Interface
	extends
	B -> Interface 
	implements
	Ramu -> class
	
*/	
interface C{
	int a=987;
}
interface A{
	void m1();
}
interface B extends A{
	void m2();
}
class Ramu implements B,C{
	public void m1(){
		System.out.println("Good");
	}
	public void m2(){
		System.out.println("very Good");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m1();
		r.m2();
	}
}