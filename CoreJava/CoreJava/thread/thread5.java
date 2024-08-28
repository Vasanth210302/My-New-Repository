/* 
						Thread Life Cycle
    
	                    wait Or block state
			          |	               ^up
			         down              |
					 
	start   ->  Runnable    <->       Running	->   	Dead
	state       pool  				  state				state
                             |
						Thread Scheduler
						
    All threads are comes to the Runnable pool
	thread Scheduler will divert the thread into wait or running 
  
*/

public class Ramu extends Thread{
   
	public void run(){
	    for(int i=0;i<10;i++){
		    System.out.println("Good: "+i);
	    }
	}
	public static void main(String args[]){
		Ramu r = new Ramu();//r itself is a thread.
		r.start();
		//System.out.println(r);//its call toString method
		//these are the stange in java.
	}
}