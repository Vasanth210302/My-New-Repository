/* 
 ArrayIndexOutOfBoundsException
 */
public class Ramu{
	public static void main(String args[]){
		int A[] = new int[]{7,6,8,9,5};
		int n=A.length;
		for(int i=0;i<n;i++){
			System.out.print(A[i]+" ");
		}
		try{
			System.out.print(A[n]);
		}
		catch(ArrayIndexOutOfBoundsException u){
			System.out.println(u);
		}
		System.out.println("Good");
	}
}