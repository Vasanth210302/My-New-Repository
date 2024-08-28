interface Raja{
	int a=34;//public static final int a=34; by default.
	void m1();
	abstract void m2();
 }
public class Ramu implements Raja{
	public void m1(){
		System.out.println("Good");
	}
	void m2(){
		//error because we didnt give public access modifier
		System.out.println("Good");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m2();
		System.out.println(a);//34
		int k=23;
		System.out.println(k);//23
		k=35;
		System.out.println(k);//35 its right
		//but
		
		final int k1=98;
		//final means fixed
		k1=90;//its wrong we cant asign value again for final variable.
	}
}