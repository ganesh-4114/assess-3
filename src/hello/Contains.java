package hello;

public class Contains {

	public static void main(String[] args) {
		
		String s1 = "PHP Exercises and Python Exercises";
		String s2 = "and";
		
		System.out.println("Original String: " + s1);
		System.out.println("Specified sequence of char values:" + s2);
		
		boolean check = s1.contains(s2);
		System.out.println(check);
	}

}
