import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = "Vasanthakumar";
		int len = s.length();
		char A[] = new char[len];
		
		for(int i=0;i<len;i++){
			char x=s.charAt(i);
		    A[i]=x;
		}
		System.out.println(A);
	}
}