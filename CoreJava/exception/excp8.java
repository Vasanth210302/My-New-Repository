/* 
   StringIndexOutOfBoundsException
 */
public class Ramu{
	public static void main(String args[]){
		String s = "Raja";
		System.out.println(s.charAt(4));//error
		
		
		for(int i=0;i<=s.length();i++){
			try{
				System.out.println(s.charAt(i));
			}
			catch(StringIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}
		System.out.println("Good");
	}
}
//Silicon Software Services.
//www.siliconsoftwareservices.com