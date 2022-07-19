package encapsulation;

public class User extends Bank
{
	public static void main(String args[])
	{
		User obj =new User();
		obj.setPin(1212);
		obj.validate();
	}
}
