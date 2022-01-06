package hello;

public class ArrayOutofBound {

	public static void main(String[] args) throws Exception {
		 try
		    {    
		      int a[]= new int[10];    
		      System.out.println(a[20]);  
		    }    
		      
		    catch(ArrayIndexOutOfBoundsException e)  
		    {  
		      e.printStackTrace();  
		    }    
		    catch(Exception e)  
		    {  
		      e.printStackTrace();  
		    }                 
		  }       
	
	}
