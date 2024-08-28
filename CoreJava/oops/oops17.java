/* 
  Encapsulation  in realtime
 */
class Ramu{
   private int empNo;
   public void set(int x){
	   empNo=x;
   }  
   public int get(){
	   return empNo;
   }
}
class Raja{
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.set(123);
		int k=r.get();
		System.out.printl(k);
	}
}

class Ramu{
   private int empno;//Global variable
   public void setEmpno(int empno){
	   //set method,this empno is the local variable
	   this.empno=empno;
	   //this keyword it indicates the current object
   }  
   public int getEmpno(){//get method
	   return empno;
   }
}
class Raja{
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.setEmpno(123);
		int k=r.getEmpno();
		System.out.printl(k);
	}
}