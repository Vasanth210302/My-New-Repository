/* 
 Causes this thread to begin execution; 
 the Java Virtual Machine calls the run method of this thread.
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