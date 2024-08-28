/* 
   constructor
   
   1.the objective of the constructoris to initialize the value.
   2.the constructor name and class name should be same.
   3.constructor should not have a returntype.
   4.If a constructor has a returntype then its becomes a method.
   5.The first line of the constructor should be either super() or this().
   6.if there is no either super() or this() in the first line of the constructor
     then the complier will supply super() automatically.
   7.If there is no constructor at all in a class then the complier will
	 supply default constructor automatically.
   8.constructor can also be overloaded.
 */
 
class Ramu{
	int a=27;
	public Ramu(){//its a default constructor (automatically created)
		super();
	}
	public static void main(String args[]){
		Ramu r=new Ramu();//-> its look any constructor there in a class
		System.out.println(r.a);
	}
}


class Ramu{
	int k=27;
	public Ramu(){//its a user defined constructor 
		super();
		System.out.println("Constructor");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();//-> its look any constructor there in a class
		System.out.println(r.k);
		
		//output  -> 1. constructor 2. 27
	}
}


class Raja{
	int a=340;
	public Raja(){
		super();
		System.out.println("Good");
	}
}
class Ramu{
	int k=27;
	public Ramu(){
		super();
		System.out.println("Constructor");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();//-> its look any constructor there in a class
		System.out.println(r.k);
	
		//output  -> 1.Good 2. constructor 3. 27
	}
}
