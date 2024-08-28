/* 
    Sleep
*/
public class Ramu extends Thread{
	public void run(){
	    for(int i=1;i<=5;i++){
			try{
				Thread.sleep(1500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("Good : "+i);
	    }
	}
	public static void main(String args[]){
		Ramu r1 = new Ramu();
		Ramu r2 = new Ramu();
		
		r1.start(); 
		r2.start(); 
		
		
	}
}

