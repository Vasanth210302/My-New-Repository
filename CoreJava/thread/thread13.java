/* 
    Synchronized
	    synchronized is used for not allowing another thread.
		while running one thread.
		this is allowing the next thread after the first thread dead state.
*/
class Raja{
	void multiplication(int n){
		synchronized(this){
			for(int i=1;i<=5;i++){
				System.out.println(i*n);
			}
		}
	}
}
class Tamil extends Thread{
	Raja r;
	Tamil(Raja r){//r = x;
		this.r = r;
	}
	public void run(){
	    r.multiplication(5);
	}
}

class SSS extends Thread{
	Raja r;
	SSS(Raja r){//r = x;
		this.r = r;
	}
	public void run(){
	    r.multiplication(15);
	}
}
public class Ramu extends Thread{
	
	public static void main(String args[]){
		Raja x = new Raja();
		Tamil t = new Tamil(x);
		SSS s = new SSS(x);
		t.start();
		s.start();
	}
}

