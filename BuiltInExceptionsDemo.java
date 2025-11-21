public class BuiltInExceptionsDemo 
{
    public static void main(String[] args) 
	{
        
        	try 
		{
            		int[] numbers = {1, 2, 3};
            		System.out.println("Accessing element at index 3: " + numbers[3]);
        	}
 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            		System.out.println("Error: Array index is out of bounds.");
       		}

		try 
		{
            		int result = 10 / 0;
        	} 
		catch (ArithmeticException e) 
		{
            		System.out.println("Error: Division by zero is not allowed.");
        	}
    }
}
