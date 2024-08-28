/* 
  classname
 */
 class Raja{
	int a=28;
	static void m2(Raja r){
		System.out.println(r.a);
	}
	public static void main(String args[]){
		m2(new Raja());
	}
 }