class Ramu{
	int m1(){
		int a=10;
		int b=20;
		return a+b;
	}
	public static void main(String args[]){
		int y=new Ramu().m1();
		System.out.println(y);
	}
}
class Raja{
	float m2(){
		float a=24.36f;
		return a+10;
	}
	public static void main(String args[]){
		int y=(int)new Raja.m2();
		System.out.println(y);//34
	}
}