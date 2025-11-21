import java.util.Scanner;

class AgeException extends Exception
{
	AgeException(String message)
	{
		super(message);
	}
}

class UserDefinedException
{

	static void checkAgeEligibility(int age) throws AgeException
	{
		if(age < 0)
		{
			throw new AgeException("Age must not be negative!!!");
		}
		else if(age < 18)
		{
			throw new AgeException("Age must not be less than 18!!!");
		}
		else
		{
			throw new AgeException("Age OK!!! You can Vote!!!");
		}
	}		

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Age: ");
		int age = scan.nextInt();

		try
		{
			checkAgeEligibility(age);
		}
		catch(AgeException ae)
		{
			System.out.println("Exception: " + ae);
			ae.printStackTrace();
		}
		finally
		{
			System.out.println("Always I am executable");
		}
	}
}