public class Ramu{
	public static void main(String args[]){
		System.out.println("Good");
		
		try{
			int y = 45/0;
		}
		System.out.println("Well");//compile time error 
		//try block join with immediate catch block.
		catch(Exception e){
			System.out.println("Hai "+e);
		}
		System.out.println("Nice");
		
		
		System.out.println("Good");
		try{
			int y = 45/0;
		}
		catch(Exception e){
			System.out.println("Hai "+e);
		}
		//finally block works in all condition.
		//either its have exception or not.
		//finally is optional .
		finally{
			System.out.println("Finally block");
		}
		System.out.println("Nice");
		
		
		System.out.println("Good");
		int y = 34;
		for(int i=-3;i<4;i++){
			int k = 0;
			try{
				k = y/i;
			}
			catch(Exception e){
			System.out.println(e);
		   }
			System.out.println(k);
		}
		
		
		
	}
}