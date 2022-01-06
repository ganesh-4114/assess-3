package hello;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Input String: "); 
		
		String abc = obj.nextLine();
		String str = abc.toLowerCase(); 
		
		String rev = "";
		for (int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
	
		
		if (str.equals(rev)) {
			System.out.println(abc  + " is a Palindrome");
		} else {
			System.out.println(abc  + " is not a Palindrome");
		}
		obj.close();
	}

}
