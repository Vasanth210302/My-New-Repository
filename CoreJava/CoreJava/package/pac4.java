/* 
      Package:-
	  
	            D:
				
			  vasanth
			
			    com
        
        silicon        software		
        -> Ramu.java   -> Raja.java
*/
package com.software;
public class Raja{
	public int a=97;
	public void m1(){
		System.out.println("Good");
	}
}

package com.silicon;
class Ramu{
	int k=83;
	void m2(){
		System.out.println("Well");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		System.out.println(r.k);
		r.m2();
		Raja r=new Raja();
		System.out.println(r.a);
		r.m1();
	}
}
/* 
 o/p
 44
 well
 22
 good
 
*/