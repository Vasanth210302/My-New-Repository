import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = "Vasanth";
		String s2 = "Kumar";		
		boolean b=s1.equals(s2);//can send any object
		
		System.out.println(b);
		
		String s3 = "Ramachandran";
		String s4 = s3.replace('a','b');//old char , new char
		System.out.println(s4);
	}
}