/* 
   abstract class;
   
   1.abstract keyword should be used in front of class keyword.
   2.we cannot create an instance or an object to the abstract
     class.so we must inherit the abstract class.
   3.An abstract class can only have abstract methods alone.
   4.An abstract class can only have ordinary/ concrete methods.
   5.An abstractclass can have both ordinary/concrete or abstract
     methods
   6.static & final keyword never comes with abstract keyword.
   7.if an abstract class has abstarct methods those abstarct
     methods must be overriden.
   8.abstarct method must be declared not define.
   9.An ordinary class will not have abstarct method.
 */
abstract class Raja{
	int a=45;
	void m1(){
		System.out.println("Good");
	}
}
class Ramu{
	int b=29;
	public static void main(String args[]){
		Ramu r1=new Ramu();
		System.out.println(r1.b);
		Raja r2=new Raja();//Error
		System.out.println(r2.a);
		r2.m1();
	}
}