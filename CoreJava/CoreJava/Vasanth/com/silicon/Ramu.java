package com.silicon;
import com.software.Raja;
class Ramu extends Raja{
	int k=83;
	void m2(){
		System.out.println("Well");
	}
	public static void main(String args[]){
		Ramu r1=new Ramu();
		System.out.println(r1.k);
		r1.m2();
		//Raja r=new Raja();
		System.out.println(r1.a);
		r1.m1();
	}
}
/* 
Running Process:
D:\JavaSSS\Vasanth>javac -classpath . com/silicon/Ramu.java

D:\JavaSSS\Vasanth>java -classpath . com/silicon/Ramu
    or
D:\JavaSSS\Vasanth>java -classpath . com.silicon.Ramu
 */