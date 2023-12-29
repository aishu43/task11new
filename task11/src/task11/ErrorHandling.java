package task11;

public class ErrorHandling {

	public static void main(String[] args) {
		
		String d =null;
		try {
		System.out.println(d.length());
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		System.out.println("User enter the incorrect password");

	}

}