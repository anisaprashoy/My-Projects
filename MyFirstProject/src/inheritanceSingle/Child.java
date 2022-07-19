package inheritanceSingle;

public class Child extends Parent
{
	int c;

	public void displayChild()
	{
		count=22;
		c=12;
		System.out.println("value of child instance variable = "+c);
		System.out.println("Child Class");
	}
	public static void main(String args[])
	{
		Child obj =new Child();
		obj.displayChild();
		obj.displayParent();
		
	}
}
