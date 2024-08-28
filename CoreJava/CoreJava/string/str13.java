import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char A[] = new char[4];
		A[0]='a';
		A[1]='b';
		A[2]='c';
		A[3]='9';
		System.out.println(A);
		String x = String.valueOf(A);
		System.out.println(A);
		
		int a = 39;
		int b = 12;
		int c = a+b;//51
		System.out.println(c);//39
		String s1 = String.valueOf(a);//39
		String s2 = String.valueOf(b);//12
		String s3 = s1+s2;//3912
		System.out.println(s3);//3912
		
	}
}