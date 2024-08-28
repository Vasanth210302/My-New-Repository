/* 
 */
 //Encapsulation
class Raja{
	private String name;
	public void setName(String name){
		this.name =  name;
	}
	public String getName(){
		return name;
	}
}
class Ramu{
	public static void main(String args[]){
		Raja r = new Raja();
		r.setName("Raja");
		String y=r.getName();
		System.out.println(y);
	}
}