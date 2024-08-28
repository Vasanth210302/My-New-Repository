/* 
    Interface
	
	1.interface is a keyword
	2.interface keyword should be used instead of class keyword 
	then it becomes an interface .
	3.we must inherit the interface since we can not create an instancee or
	an object to the interface.
	4.An interface only will have abstract methods alone.
    5.in interface all the methods by default 'public abstract'
    6.in interface all the variables by default " public static final "	
	7. all the methods from an interface must be overriden.
 */
interface Raja{
	int a=34;
 }
public class Ramu{
	public static void main(String args[]){
		Raja r=new Raja();//3 we cant create object for interface.
	}
}

interface Raja{
	int a=34;
 }
public class Ramu implements Raja{
	public static void main(String args[]){
		Ramu r=new Ramu();
		int b=r.a;
		System.out.println(b);
		System.out.println(b);
	}
}