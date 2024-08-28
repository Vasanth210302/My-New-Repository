public class Ramu{
	public static void main(String args[]){
		System.out.println("Good");
		//int y = 45/0; //Here i am getting exception.
		
		try{
			int y = 45/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Nice");
	}
}