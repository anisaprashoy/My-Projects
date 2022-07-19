package encapsulationEg2;

public class Bank1 
{
	private float money;
	private int customerId;
	public float getMoney() 
	{
		money=money+1000;
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}
