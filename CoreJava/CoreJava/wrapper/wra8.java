/* 
  parseInt
*/
public class Ramu{
	public static void main(String args[]){
		
		String a = "12";
		String b = "40";
		//String b = "fourty";wrong
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		int k = i+j;
		System.out.println(k);
		System.out.println(Integer.SIZE);//32
		System.out.println(Integer.MAX_VALUE);//2^32-1
		System.out.println(Integer.MIN_VALUE);//-2^32
		//32
        //2147483647
        //-2147483648
	}
}