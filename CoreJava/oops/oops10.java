/* 
  2.method overriding
  
  1.It happens in different class
  2.class must be inherited
  3.syntax should be same,which means returntype,
    methodname,and parameter should be same.
  4.final annd static method cannot be overriden.
  5.access modifier should be either equal or stronger
    (wider) not weaker (narrower).
  6.logic can be anything.
 */
class Raja{
	void add(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
 }
class Ramu extends Raja{
	void add(int a,int b){
		int c=a+b;
		System.out.println(c);
		System.out.println("Good");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.add(10,20);
	}
 }
 //30 Good