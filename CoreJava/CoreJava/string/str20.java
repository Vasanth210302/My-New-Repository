 
/*
   Palindrome
*/
import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
	    String s1 = s.next();
		char A[] = s1.toCharArray();
		int i = 0; 
		int j = (A.length)-1; 
		while(i<j){
			char  temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;
			j--;
		}
		System.out.println(A);
		String s2 = new String(A);
		System.out.println(s2);
		
		boolean b = s1.equals(s2);
		System.out.println(b);
    }
}