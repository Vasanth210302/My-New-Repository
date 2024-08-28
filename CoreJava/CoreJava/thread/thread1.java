/* 
  Multi Thread
*/
public class Ramu{
	void m1(double x){
		System.out.println(x);
	}
	public static void main(String args[]){
		Ramu r = new Ramu();
		r.m1(12);//widening process
		//its check first int then float , long , then double.
	}
}




class Ramu{
	
}
class Raja extends Ramu{
	void m1(Ramu g){
		System.out.println("Good");
	}
	void m1(Raja g){
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