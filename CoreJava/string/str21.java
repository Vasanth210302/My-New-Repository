 
/*
   Palindrome
*/
import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		StringBuffer sb = new StringBuffer(s1);
		
		sb.reverse();
		System.out.println(sb);
		
		String s2 = new String(sb);
		
		boolean b = s1.equals(s2);
		System.out.println(b);
		
    }
}