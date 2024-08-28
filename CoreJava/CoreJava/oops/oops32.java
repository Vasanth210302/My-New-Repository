/*  */
class raja{
	int a=14;
	Raja(int k){
		super();
		System.out.println(k);
	}
	Raja(boolean b){
		this(40);
		System.out.println(b);
	}
}
class Ramu extends Raja{
	Ramu(float x){
		super(true);
		System.out.println(x);
	}
	Ramu(int n){
		this(42.3f)
		System.out.println(n);
	}
	public static void main(String args[]){
		Ramu r=new Ramu(44);
		System.out.println(r.a);
	}
}
/* 
  o/p
  1.40
  2.true
  3.42.3
  4.44
  5.14
 */