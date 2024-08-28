/*  */
class Tamil{
	
}
class Ramu extends Tamil{
	
}
class Raja extends Ramu{
	void m1(Tamil g){
		System.out.println("Good");
	}
}
public class SSS{
	public static void main(String args[]){
		Raja r = new Raja();
		r.m1(new Ramu());//creating obeject for the class
		r.m1(r);
		r.m1(new Raja());//its also crt.
		//calling super class by subclass object.
		//Ramu g = new Raja();
		//Raja d = new Ramu();
		//its wrong bcas cant call sub class by super class object.
	}
}


class Tamil  extends Object{//this is not maditory 
//compiler will automatically extends object
	
}
class Ramu extends Tamil{
	
}
class Raja extends Ramu{
	void m1(Object g){//now we call all the sub classes in the file
		System.out.println("Good");
	}
}
public class SSS extends Object{//automatically extends
    //now the SSS is also the subclass for obeject.
	public static void main(String args[]){
		Raja r = new Raja();
		r.m1(new Raja());//Object g =new Raja();
		r.m1(new Ramu());//Object g =new Ramu();
		r.m1(new Tamil());//Object g =new Tamil();
		r.m1(new Object());//Object g =new Object();
		r.m1(new SSS());//Object g =new SSS();
		String s = new String("vasanthakumar");
		//String is also extends object 
		r.m1(s);//Object g =new String();
		
	}
}





interface Ramu{
	
}
class Raja implements Ramu{
	void m1(Ramu g){//Ramu g = new Raja();
		System.out.println("Good");
	}
}
public class SSS {
	public static void main(String args[]){
		Raja r = new Raja();
		r.m1(new Raja());//crt
		//we can only use sub class obeject.
        //bcas its an interface 
        //we cant create a obeject for an interface and abstract
        r.m1(new Ramu());//not crt
	}
}