/* 
  Overridng
 */
class Raja{
	void m1(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
}
class Ramu extends Raja{
	void m1(int a,int b){ //overriden method
		int c=a+b;
		System.out.println(c);
		System.out.println("Welcome");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m1(12,34);
	}
}