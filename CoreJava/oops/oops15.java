class Raja{
	private void m1(){
		System.out.println("Good");
	}
}
//ertyui
/* 
 */
class Ramu extends Raja{
    void m1(){ //this m1 method as the separate method
		System.out.println("Welldone");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m1();
	}
}