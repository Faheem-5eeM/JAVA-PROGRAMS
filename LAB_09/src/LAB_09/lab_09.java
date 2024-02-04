package LAB_09;
class divideByZeroException extends Exception
{
	public divideByZeroException(String message)
	{
		super(message);
	}
}

public class lab_09 
{

	public static void main(String[] args) 
	{
		int numerator = 10, denominator = 2;
		try
		{
			if(denominator == 0)
			{
				throw new divideByZeroException("Error: cannot divide by negative integer.");
			}
			else
			{
				int answer = numerator/denominator;
				System.out.println("answer : "+answer);
			}
		}
		catch(divideByZeroException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("I am in final block.");
		}
  
	}

}
