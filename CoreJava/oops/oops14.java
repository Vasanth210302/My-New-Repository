/* 
  private 
  
 */
class Raja{
	private int a=23;
	
}
class Ramu extends Raja{
	int b=42;
	public static void main(String args[]){
		Ramu r=new Ramu();
		System.out.println(r.a);//error
	}
}



class Raja{
	private int a=23;
	void m2(){
		System.out.println(a);
		//non-static to non-static
	}
}
class Ramu extends Raja{
	int b=42;
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m2();
	}
}

