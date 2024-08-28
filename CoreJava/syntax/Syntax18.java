/* 
  class ramu{
	  variables;
	  methods
	  main method
  }

 */

class Ramu{
	
	int a=30;
	public int b=48;
	void add(){
		System.out.println("Good");
	}
	void m1(){
		System.out.println("Nice");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		System.out.println(r.a);//20
		System.out.println(r.b);//48
		r.add();//good
		r.m1();//nice
	}
}