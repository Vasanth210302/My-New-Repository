interface Raja{
	int a=34;
	public abstract/default/ void m1(){
		//error because interface doesnt have method definition. 
		System.out.println("Good");
	}
	public abstract void m2();//right
	void m2();//right
 }
public class Ramu implements Raja{
	public void m2(){
		System.out.println("Good");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m2();
	}
}