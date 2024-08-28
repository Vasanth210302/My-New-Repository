/* 
    API- Application Programming Interfaces.
	
	java 6 documentation in oracle and click lang and util package
	and click the Math class and search the methods summary
	Math Class :
	->import java.lang.Math;
  
 */
import java.lang.Math;
class Ramu{
	public static void main(String args[]){
		double x=Math.sin(90*(3.14/180));
		System.out.println(x);
		
		double y=Math.toRadians(90);
		double z=Math.sin(y);
		System.out.println(z);
	}
}