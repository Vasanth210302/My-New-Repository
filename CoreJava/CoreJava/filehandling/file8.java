/* 
  BufferedReader
 */

import java.io.BufferedReader ;
import java.io.FileReader;
import java.io.IOException;

public class file8{
	
	
	public static void main(String args[])throws IOException{
		
		FileReader fr = new FileReader("testout.txt");
		BufferedReader br = new BufferedReader(fr);
		int i=0;//its return int values
		//if i reaches -1 then the file has not any datas.
		while((i=br.read())!=-1){
			System.out.print((char)i);
		}
		br.close();
	}
}