/* 
  classname -> parameter
 */
 class Ramu{
	void m2(Ramu r){//parameter
		System.out.println("Good");
	}
	public static void main(String args[]){
		Ramu r=new Ramu();
		r.m2(new Ramu());//arg
		r.m2(r);
	}
 }
 