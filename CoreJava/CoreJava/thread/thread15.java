/* 
    Synchronized method.
*/
class Raja{
	synchronized void multiplication(int n){
		System.out.println("GOOD");
		System.out.println("WOW");
		
		for(int i=1;i<=5;i++){
			System.out.println(i*n);
		}
		
		System.out.println("NICE");
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

/* 
GOOD
GOOD
WOW
15
30
45
60
75
NICE
WOW
5
10
15
20
25
NICE
 */