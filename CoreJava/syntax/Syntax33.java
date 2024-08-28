/* 
  classname => return type , parameter
 */
 class Ramu{
	Ramu m1(){
		System.out.println();
		return new Ramu();
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		Ramu y=r.m1();
	}
 }