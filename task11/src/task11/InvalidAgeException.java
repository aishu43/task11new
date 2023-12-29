package task11;

public class InvalidAgeException {

	public static void main(String []arg)
	{
	try
	
	{
		int age =Integer.parseInt(arg[0]);
		if (age<18)
			
			throw new ArithmeticException("InvalidAgeException");
		else
			
		{
			System.out.println("validAgeException");
		}
			
	}
	catch(Exception e)
	{
		System.out.println(e);
	}    
	}
}