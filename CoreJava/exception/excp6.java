/* 
    Null pointer Exception
 */
public class Ramu{
	int a = 45;
	public static void main(String args[]){
		
		Ramu r = new Ramu();
		System.out.println(r.a);
		r = null;
		System.out.println(r.a);//it will have null
		
		
	}
}


public class Ramu{
	int a = 45;
	public static void main(String args[]){
		
		Ramu r = new Ramu();
		System.out.println(r.a);
		r = null;
		try{
			System.out.println(r.a);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("Welcome");//it will have null
		
		
	}
}