
class Ramu{
	int a=30;
	Ramu(int k){
		System.out.println("Good");
		System.out.println(k);
	}
	Ramu(){
		System.out.println("Nice");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		System.out.println(r.a);
		Ramu r=new Ramu(12);
	}
}
/* 
  o/p
  1.Nice
  2.30
  3.Good
  4.12
 */
 
 
 
class Ramu{
	int a=30;
	Ramu(int k){
		super();
		System.out.println("Good");
		System.out.println(k);
	}
	Ramu(){
		this(23);
		System.out.println("Nice");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		System.out.println(r.a);
	}
}
/* 
  o/p
  1.Good
  2.23
  3.Nice
  4.30
 */
 
 
 
 
 
class Ramu{
	int a=30;
	Ramu(int k){
		this();
		System.out.println("Good");
		System.out.println(k);
	}
	Ramu(){
		System.out.println("Nice");
	}
	public static void main(String args[]){
		Ramu r=new Ramu(98);
		System.out.println(r.a);
	}
}
/* 
  o/p
  1.Nice
  2.Good
  3.98
  4.30
 */