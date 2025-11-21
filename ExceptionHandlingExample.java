import java.util.Scanner;

public class ExceptionHandlingExample 
{

     static double divide(int numerator, int denominator) 
	{
        	return numerator / denominator;
    	}

    public static void main(String[] args) 
{
        try (Scanner scanner = new Scanner(System.in)) 
	{
            	System.out.print("Enter the numerator: ");
            	int num1 = scanner.nextInt();
            	System.out.print("Enter the denominator: ");
            	int num2 = scanner.nextInt();
		double result = divide(num1, num2);
            	System.out.println("Result: " + result);
        } 
	catch (ArithmeticException e) 
	{
            	System.out.println("Error: Division by zero is not allowed.");
        } 
	catch (Exception e) 
	{
		System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
	finally 
	{
            System.out.println("Exiting the program.");
        }
    }
}
