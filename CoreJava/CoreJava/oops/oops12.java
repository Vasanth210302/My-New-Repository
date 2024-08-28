 /* 
  Overriding
  calling super class method overriden in subclass 
  then it calls from subclass by super keyword.
  //super keyword must be call from non static method only.
 */
class Raja{
	int h=45;
	void m1(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	static void m2(){
		System.out.println("Good");
	}
}
class Ramu extends Raja{
	void m1(int a,int b){ //overriden method
		int c=a+b;
		System.out.println(c);
		System.out.println("Welcome");
		super.m1(10,20);
		System.out.println(super.h);
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m1(12,34);//op ->  46 Welcome
		//Raja r1=new Raja();
		//r1.m2(12,23);
		
	}
}