interface Raja{
	int add(int a,int b);
}
abstract class Tamil{
	abstract int area(int a,int b);
}
class Ramu extends Tamil implements Raja{
	public int add(int a,int b){
		return a+b;
	}
	int area(int a,int b){
		return a*b;
	}
	public static void main(String args[]){
	    Ramu r=new Ramu();
		int h=r.add(10,20);
		System.out.println(h);
		int g=r.area(4,6);
		System.out.println(g);
	}
}