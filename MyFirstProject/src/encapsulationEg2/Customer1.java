package encapsulationEg2;

public class Customer1
{
	public static void main(String[] args)
	{
		Bank1 b1=new Bank1();
		
		b1.setMoney(1000.5f);
		b1.setCustomerId(12);
		float balance=b1.getMoney();
		
		System.out.println("Customer Id : "+b1.getCustomerId());
		System.out.println("Balance : "+balance);
		
	}
}

	