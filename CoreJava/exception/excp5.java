/* 
  Multi catch block is allowed.
 */
public class Ramu{
	public static void main(String args[]){
		System.out.println("Nice");
		
		try{
			int k = 34/0;//ArithmeticException
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("1"+e);
		}
		catch(ArithmeticException e){
			System.out.println("2"+e);
		}
		catch(NullPointerException e){
			System.out.println("3"+e);
		}
		System.out.println("Good");
		
		
		
		
		System.out.println("Nice");
		try{
			int k = 34/0;//ArithmeticException
		}
		catch(Exception e){//wrong 
//first catch is super class then 3rd catcch is subclass its an error 
			System.out.println("1"+e);
		}
		catch(NullPointerException e){
			System.out.println("2"+e);
		}
		catch(ArithmeticException e){
			System.out.println("3"+e);
		}
		System.out.println("Good");
		
		
		
		System.out.println("Nice");
		try{
			int k = 34/0;//ArithmeticException
		}
		catch(ArrayIndexOutOfBoundsException e){//wrong 
//first catch is super class then 3rd catcch is subclass its an error 
			System.out.println("1"+e);
		}
		catch(NullPointerException e){
			System.out.println("2"+e);
		}
		catch(Exception e){
			System.out.println("3"+e);
		}
		System.out.println("Good");
		
		
		System.out.println("Nice");
		try{
			int k = 34/0;//ArithmeticException
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("1"+e);
		}
		catch(NullPointerException e){
			System.out.println("2"+e);
		}
		catch(Exception e){
			System.out.println("3"+e);
		}
		System.out.println("Good");
		
		
	}
}