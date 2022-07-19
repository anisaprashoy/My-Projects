package exceptionExample;

public class ExceptionExample1 
	{
		public int operations(int num1,int num2)
		{
			int[] arr =new int[5];
			try
			{
				int res;
				res=num1/num2;
				System.out.println("Result : "+res);
				for(int i=0;i<=arr.length;i++)
				{
					arr[i]=i+1;
					System.out.println(arr[i]);
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by zero not possible");
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Array lenth is 5");
			}
			catch(Exception ee)
			{
				System.out.println("Exception occured");
			}
			finally
			{
				System.out.println("Finally Block");
			}
			System.out.println("End");
			
			return 0;
			}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ExceptionExample1 obj=new ExceptionExample1();
		obj.operations(5,12);
		
	}

}
