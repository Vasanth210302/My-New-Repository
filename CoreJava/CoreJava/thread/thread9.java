/* 
  getPriority();
  
  system will automatically set priority as  5;
  its assign before starting the thread.
  we can give any number between  1 to 10.
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
		
		int a = r1.getPriority();
		int b = r2.getPriority();
		int c = r3.getPriority();
		System.out.println(a);//5
		System.out.println(b);//5
		System.out.println(c);//5
		/* r1.setPriority(1);
		r2.setPriority(5);
		r3.setPriority(10);
		r1.start();
		r2.start();
		r3.start(); */
		
		
	}
}


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
		/* 
            r1.setPriority(Thread.MAX_PRIORITY);//10
		    r2.setPriority(Thread.MIN_PRIORITY);//1
		    r3.setPriority(Thread.NORM_PRIORITY);//5
		*/
		int a = r1.getPriority();
		int b = r2.getPriority();
		int c = r3.getPriority();
		System.out.println(a);//1
		System.out.println(b);//5
		System.out.println(c);//10
		/* 
		r1.start();
		r2.start();
		r3.start(); */
		
		
	}
}



public class Ramu extends Thread{
	public void run(){
	    for(int i=0;i<10;i++){
			Thread t = Thread.currentThread();//Thread[Thread-0,5,main]
			int a = t.getPriority();
			String s = t.getName();//Thread-(0,1,2)
		    System.out.println(a+" "+s);
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