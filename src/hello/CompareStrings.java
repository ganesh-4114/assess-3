package hello;

public class CompareStrings {

	public static void main(String[] args) {
		String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
           
        int result = str2.compareToIgnoreCase(str1);   

        if (result < 0)
        {
            System.out.println(str1 + " is less than " + str2 );
        }
        else if (result > 0)
        {
            System.out.println(str1 + " is greater than  " + str2);
        }
        else 
        {
            System.out.println(str1 + " is equals " + str2 );
        }

		
	}

}
