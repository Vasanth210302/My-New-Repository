import java.util.Scanner;
public class Ramu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("Vasanthakumar");
		System.out.println(sb);
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1);
		//sb.reverse();
		System.out.println(sb);
    }
}
/* 
   str1 --->Vasanthakumar
   str1 --->ramukahtnasaV
   first string was no more pointing
   
   String immutable
   
   String s1 = "abcd";
   sop(s1);//abcd
   s1 = s1.concat("mno");
   sop(s1);//mno
   
   StringBuffer s1 = "abcd";
   sop(s1);//abcd
   s1.reverse();
   sop(s1);//dcba
 */
/* StringBuffer is mutable
 append
 charAt
 delete
 deleteCharAt
 length
 reverese
 setCharAt
*/