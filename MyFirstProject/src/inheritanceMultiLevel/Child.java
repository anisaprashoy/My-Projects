package inheritanceMultiLevel;

public class Child extends Intermideate
{
	public void displayChild()
	{
		count=22;
		System.out.println("Child");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.displayChild();
		obj.displayIntermideate();
		
		obj.diplayParent();
	}
}
