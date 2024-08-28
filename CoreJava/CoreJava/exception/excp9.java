/* 
   
 */
public class Ramu{
	void display(int age){
		if(age < 18){
			throw new ArithmeticException("Your not Eligible");
		}
		else{
			System.out.println("Welcome to voting");
		}
	}
	public static void main(String args[]){
		
		Ramu r = new Ramu();
		r.display(12);
		
		System.out.println("Good");
	}
}
//Silicon Software Services.
//www.siliconsoftwareservices.com