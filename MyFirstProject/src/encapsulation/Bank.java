package encapsulation;

public class Bank 
{
	private int pin;

	public int getPin(int pin)
	{	
		return pin;
	}

	public void setPin(int pin) 
	{
		this.pin = pin;
	}
	public void validate()
	{
		if(pin==1212)
		{
			System.out.println("Valid Pin");
		}
		else if(pin==1012)
		{
			System.out.println("Valid Pin");
		}
		else if(pin==1112)
		{
			System.out.println("Valid Pin");
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}
}
