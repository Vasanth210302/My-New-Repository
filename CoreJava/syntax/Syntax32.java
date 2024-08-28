/* 
 widening process
 */
 class Ramu{
	void m1(int a){
		System.out.println("int");
	}
	void m1(float b){
		System.out.println("float");
	}
	void m1(double b){
		System.out.println("double");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m1(12);//"int"
	}
 }