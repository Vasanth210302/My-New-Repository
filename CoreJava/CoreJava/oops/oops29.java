class Raja extends Object{//root class 
	public Raja(){
		super();
		System.out.println("Good");
	}
	int a=48;
}
class Ramu extends Raja{
	public Ramu(){
		super();
		Syste.out.println("Nice");
	}
	int b=28;
	public static void main(String args[]){
		Ramu r=new Ramu();
		System.out.println(r.a);//48
		System.out.println(r.b);//28
	}
	
	/*  
	output
	 1.Good
	 2.Nice
	 3.48
	 4.28

	*/
}