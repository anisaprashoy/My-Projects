package exceptionpractice;

public class JavaExceptionEg 
{
public static void main(String args[])
{
	try
	{
		int d=100/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Division by Zero is not possibe");
	}
	System.out.println("Rest of the code");
}
}
