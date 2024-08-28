/* 
   multiple classes 
*/
class Raja{
	void m1(){
		System.out.println("Nice");
	}
}
public class Ramu  extends Raja implements Runnable{
	public void run(){
	    for(int i=0;i<10;i++){
			
		    System.out.println("Good : "+i);
	    }
	}
	public static void main(String args[]){
		Ramu r1 = new Ramu();
		Ramu r2 = new Ramu();
		Thread t1 = new Thread(r1);//sub class refe for super class calling
		Thread t2 = new Thread(r2);
		t1.start(); 
		t2.start(); 
		
		
	}
}


/* 
   using Interface 
*/
public class Ramu implements Runnable{
	public void run(){
	    for(int i=0;i<10;i++){
			
		    System.out.println("Good : "+i);
	    }
	}
	public static void main(String args[]){
		Ramu r1 = new Ramu();
		Ramu r2 = new Ramu();
		Thread t1 = new Thread(r1);//sub class refe for super class calling
		Thread t2 = new Thread(r2);
		t1.start(); 
		t2.start(); 
		
		
	}
}

