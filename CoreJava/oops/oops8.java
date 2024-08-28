/* 
  2.polymorphism
  
    1.compileTime Polymorphism or method overloading
	2.tunTime Polymorphism or method overriding
	
	Method Overloading
	
	1.It happens in the same class
	2.method name should be same
	3.parameter sholud be different
	4.remaining all can be anything

 */
class Ramu{
	int area(int a,int b){
		return (a*b);
	}
	static float area(float a,float b){
		return (a*b);
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		int k=r.area(10,20);
		System.out.println(k);
	}
}