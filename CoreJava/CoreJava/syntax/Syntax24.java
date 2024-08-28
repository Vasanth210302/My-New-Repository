/* 
 */
 class Raja{
	float m1(){
		System.out.println("Good");
		return 48.23f;
	}
	public static void main(String args[]){
		Raja r=new Raja();
		float k=r.m1();//48.23 (reusablility)
		System.out.println(k);
	}
}