import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = "VASANTHAKUMAR S";
	
		char A[] = s.toCharArray();
		System.out.println(x.length);
		
		//to find the array length arrayname.length
		int i=0; int j=(x.length)-1;
		while(i<j){
			char m = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;j--;
		}
		System.out.println(x);
	}
}