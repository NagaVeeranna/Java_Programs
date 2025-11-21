import java.util.*;

class ExceptionHandling
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int n, d, result = 0;

		int index;
		
		try 
		{
			System.out.println("Enter Numerator: ");
			n = scan.nextInt();
			System.out.println("Enter Denominator: ");
			d = scan.nextInt();
			System.out.println("Enter Index: ");
			index = scan.nextInt();

			try
			{
				result = n / d;

				int[] arr = new int[10];
				arr[index] = 25;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Run Time Error: " + e);
			}
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Run Time Error: Input must be only Integer: " + ime);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Run Time Error: Denominator must not be ZERO: " + ae);

		}
		finally
		{
			System.out.println("I am always executable!!!");
		}
		System.out.println("Result: " + result);

		System.out.println("Check am I executable!!!");
	}
}