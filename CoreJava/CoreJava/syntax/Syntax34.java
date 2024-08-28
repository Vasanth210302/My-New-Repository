/* 
 */
 class Raja{
	static Raja m1(){
		return new Raja();
	}
	int y=24;
	public static void main(String args[]){
		Raja r=m1();
		System.out.println(r.y);//24
	}
 }