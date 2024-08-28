/*  
 Multi thread
*/

public class Ramu extends Thread{
	public void run(){
	    for(int i=0;i<10;i++){
		    System.out.println("Good: "+i);
	    }
	}
	public static void main(String args[]){
		Ramu r1 = new Ramu();//r1 is the thread.
		Ramu r2 = new Ramu();//r2 is also the another thread.
		r1.start();//starts the thread and goes to the dead state.
		r1.start();
		//it was an error bcas the r1.thread was already dead.
		//it gives IllegalThreadStateException.
	}
}



public class Ramu extends Thread{
	public void run(){
	    for(int i=0;i<10;i++){
		    System.out.println("Good: "+i);
	    }
	}
	public static void main(String args[]){
		Ramu r1 = new Ramu();//r1 is the thread.
		Ramu r2 = new Ramu();//r2 is also the another thread.
		r1.start();//starts the thread and goes to the dead state.
		r2.start();//starts the another thread.
		
	}
}
/* 
Good: 0
Good: 0
Good: 1
Good: 2
Good: 1
Good: 3
Good: 2
Good: 3
Good: 4
Good: 5
Good: 6
Good: 7
Good: 8
Good: 9
Good: 4
Good: 5
Good: 6
Good: 7
Good: 8
Good: 9

 */