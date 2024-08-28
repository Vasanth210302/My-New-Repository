/* 
  Thread -> java.lang package
  
  Thread class implements Runnable.
  we must inherit the all methods in Runnable.
  Runnable interface have run() method.
  so we must override this in our class.
 */
public class Ramu extends Thread{
	/* public void run(){
		System.out.println("Good");
	} */
	public void run(){
	    for(int i=0;i<10;i++){
		    System.out.println("Good: "+i);
	    }
	}
	public static void main(String args[]){
		Ramu r = new Ramu();
		r.run();
	}
}