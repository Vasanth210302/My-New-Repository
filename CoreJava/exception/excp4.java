/* 
ArithmeticException
 */
public class Ramu{
	public static void main(String args[]){
		System.out.println("Nice");
		
		try{
			int k = 34/0;//ArithmeticException
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Good");
		
		try{
			int k = 34/0;//ArithmeticException
		}
		catch(NullPointerException e){//wrong
			System.out.println(e);
		}
		System.out.println("Good");
	}
}