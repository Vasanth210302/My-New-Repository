/* 
  Priority Setting
  
  There is no guarenty fro the priority setting.
  but there is some probability.
  Default priority is five.
  max = 10; min = 1; nor or def = 5;
 */

public class Ramu extends Thread{
	public void run(){
	    for(int i=0;i<10;i++){
			Thread t = Thread.currentThread();//Thread[Thread-0,5,main]
			String s = t.getName();//Thread-(0,1,2)
		    System.out.println("Good: "+i+" "+s);
	    }
	}
	public static void main(String args[]){
		Ramu r1 = new Ramu();//r1 is the thread.
		Ramu r2 = new Ramu();//r2 is also the another thread.
		Ramu r3 = new Ramu();//r3 is also the another thread.
		r1.setPriority(1);
		r2.setPriority(5);
		r3.setPriority(10);
		r1.start();
		r2.start();
		r3.start();
		
	}
}