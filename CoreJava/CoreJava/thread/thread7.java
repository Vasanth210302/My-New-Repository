/* 
  Set Name  and get Name 
 */

public class Ramu extends Thread{
	public void run(){
	    for(int i=0;i<10;i++){
			Thread t = Thread.currentThread();//Thread[Vasanth,5,main]
			String s = t.getName();//Vasanth
		    System.out.println("Good: "+i+" "+s);
	    }
	}
	public static void main(String args[]){
		Ramu r1 = new Ramu();//r1 is the thread.
		Ramu r2 = new Ramu();//r2 is also the another thread.
		Ramu r3 = new Ramu();//r3 is also the another thread.
		r1.setName("Vasanth");
		r2.setName("Ramu");
		r3.setName("Vaken");
		r1.start();
		r2.start();
		r3.start();
		
	}
}