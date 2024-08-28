import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = "He is a good doctor";
		String x[]=s.split(" ");
		 
		for(int i=x.length-1;i>=0;i--)
		System.out.println(x[i]);
	
	    for(int i=0;i<x.length;i++)
		System.out.println(x[i]);
	}
}