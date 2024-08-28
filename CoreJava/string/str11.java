import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = "VASANTHAKUMAR S";
		String s1 = new String("Vasanth");
		
		int len = s.length();
		char A[] = s.toCharArray();
		
		for(int i=0;i<len;i++)
		System.out.print(A[i]+" ");
	}
}