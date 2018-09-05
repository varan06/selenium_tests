package selenium;

public class Fibonnaci {
	public static void main(String[] args)
	{
	
		 int a = 100; 
		 int b = 0;
		 int c = 1;
		 
	        System.out.print("Fibonacci Series of "+a+" numbers:");
 
	        for (int i = 1; i <= a; i++)
	        {
	            System.out.print(b+" ");
	            
 
	      
	            int sum = b + c;
	            b = c;
	            c = sum;
		        
	 
		}
	}

}
