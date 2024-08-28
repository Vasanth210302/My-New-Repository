/* 
  method overloading
 */
 class Ramu{
	int area(int a,int b){
		return (a*b);
	}
	static float area(float a,float b){
		return (a*b);
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		int k=r.area(10,20);
		System.out.println(k);
	}
}