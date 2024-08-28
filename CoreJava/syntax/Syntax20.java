/* 

 */
 //3rd
 class Ramu{
	static int a=23;//static variable
	static void m1(){//static method
		System.out.println("Good");
	}
	void m2(){//non static method 
		System.out.println(a);
		m1();
		System.out.println("Nice");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m2();
		System.out.println("Well");
	}
 }