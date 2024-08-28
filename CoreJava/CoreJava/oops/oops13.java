/* 
  overriding 
  5 point 
   Accesmodifier (stronger and weaker)
  1.public 
  2.protected
  3.default
  
  1,2,3 -> Stronger
  3,2,1 -> weaker
  Overriding must be stronger
  
  stronger -> public
              protected
			  default
  weaker   -> default
              protected
			  public 

 */
 class Raja{
	 void m1(int a,int b){
		 int c=a+b;
		 System.out.println(c);
	 }
 }
 class Ramu extends Raja{
	void m1(int a,int b){ //overriden method
		int c=a+b;
		System.out.println(c);
		System.out.println("Welcome");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m1(12,34);
	}
 }