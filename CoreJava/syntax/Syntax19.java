/* 
  when we need to create object or instance
  
  method		members			object Required
  
  static 		non-static 		yes
  static 		static			no
  non-static 	static			no
  non-static	non-static		no

 */
 //1 st 
 class Ramu{
	int a=23;//member of this class
    void m1(){
		System.out.println("Good");
	}	
	//variable a and method m1 both are non-static members
	public static void main(String args[]){//main method is static method
		Ramu r=new Ramu();
        System.out.println(r.a);
     	r.m1();	
	}
 }
 //2 nd
 class Ramu{
	static int a=23;//member of this class
    static void m1(){
		System.out.println("Good");
	}	
	//variable a and method m1 both are non-static members
	public static void main(String args[]){//main method is static method
		
        System.out.println(a);
     	m1();	
	}
 