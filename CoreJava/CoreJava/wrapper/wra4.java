/* 
   reference calls toString method in the class.
  
 */
public class Ramu extends Object{
	public String toString(){
		return "Vasanthakumar";
	}
	public static void main(String args[]){
		Ramu r = new Ramu();
		System.out.println(r);//Ramu@hashcode
	}
}


public class Ramu{
	public static void main(String args[]){
		Integer i = new Integer(89);
		System.out.println(i);//89
		
		Double d = new Double(89.8);
		System.out.println(d);//89.9
		//if Double class has toString else Double@hashcode.
	}
}



