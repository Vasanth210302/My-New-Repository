import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("Vasanthakumar");
		
		System.out.println(sb);
		sb.append(23);
		System.out.println(sb);
		
		sb.delete(2,5);//2 inclusive 5 exclusive
		System.out.println(sb);
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		
    }
}