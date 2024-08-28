/* 
 */
 class Ramu{
	void m1(short a){
		System.out.println(a);
	}
	public static void main(String args[]){
		Ramu r=new ramu();
		r.m1((short)22);//arguments
		//int converted as short
		//another way
		short x=22;
		r.m1(x);
	}
 }