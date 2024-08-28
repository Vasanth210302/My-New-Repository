/* 
  compatability for double
  ->int ,byte ,short,long,float
 */
 class Ramu{
	double m3(){
		int a=10;
		int b=20;
		return (a+b);
	}
	public static void main(String args[]){
		double y=m3();
		System.out.println(y);
	}
 }