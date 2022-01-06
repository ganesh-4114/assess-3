package hello;

public class UserDef {
	public int mul(int a, int b){
		return a*b;
	   }
	
	 public static void main(String args[]){
		 UserDef obj = new UserDef();
		 System.out.println(obj.mul(10, 20));
	 }

	
}
