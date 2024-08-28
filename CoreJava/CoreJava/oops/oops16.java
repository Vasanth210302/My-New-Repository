/* 
  Encapsulation (hiding the data)
 */
class Ramu{
   private int a=30;	
   int m2(){
	   return a;
   }
}
class Raja{
	public static void main(String args[]){
		Ramu r=new Ramu();
		System.out.println(r.a);//error 
		int k=r.m2();
		System.out.printl(k);
	}
}