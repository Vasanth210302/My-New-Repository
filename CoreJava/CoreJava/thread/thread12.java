/* 
    join
*/
public class Ramu extends Thread{
	public void run(){
	    for(int i=1;i<=5;i++){
			System.out.println("Good : "+i);
	    }
	}
	public static void main(String args[]){
		Ramu r1 = new Ramu();
		Ramu r2 = new Ramu();
		Ramu r3 = new Ramu();
		
		r1.start(); 
		try{
			r1.join();
		}
//this method does r1 thread one complete then
// only the next thread was started.
		catch(InterruptedException e){
			System.out.println(e);
		}
		r2.start(); 
		r3.start(); 
		/* 
Good : 1
Good : 2
Good : 3
Good : 4
Good : 5
Good : 1
Good : 2
Good : 3
Good : 4
Good : 5
Good : 1
Good : 2
Good : 3
Good : 4
Good : 5
 */
		
	}
}




public class Ramu extends Thread{
	public void run(){
	    for(int i=1;i<=5;i++){
			try{
				Thread.sleep(500);
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
		Ramu r3 = new Ramu();
		
		r1.start(); 
		try{
			r1.join(1500);
		}
//after 1500 ms next thread was started.
//execute only 3 time bcas thread sleep 500ms.
		catch(InterruptedException e){
			System.out.println(e);
		}
		r2.start(); 
		r3.start(); 
		/* 
Good : 1
Good : 2
Good : 3
Good : 1
Good : 1
Good : 4
Good : 2
Good : 2
Good : 5
Good : 3
Good : 3
Good : 4
Good : 4
Good : 5
Good : 5
		*/
	}
	
}