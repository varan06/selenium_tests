package selenium;

public class Fibonaciwhile {
	public static void main(String[] args)
	{
	
		 int a = 100; 
		 int b = 0;
		 int c = 1;
		 
	        System.out.print("Fibonacci Series of "+a+" numbers:");
 
	        int i = 1;
	        while(i<=a)
	        {
	            System.out.print(b+" ");
	            int sum = b + c;
	            b = c;
	            c = sum;
		        i++;
	 
		    }
	}

}


