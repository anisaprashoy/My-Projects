package interface_example;

public class InterfaceClass implements SampleInter3
{
	public void display()
	{
	System.out.println("Hi SmapleInter1");	
	}
	public void detail()
	{
	System.out.println("Hi SmapleInter2");	
	}
	
	public void inter()
	{
	System.out.println("Hi Inter");	
	}

	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
		InterfaceClass i = new InterfaceClass();
		i.display();
		i.detail();
		i.inter();
	}

}
