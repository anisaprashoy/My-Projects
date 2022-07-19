package polymorphism;
//overriding happens only in instance method
class Bike
{
	void run()
	{
	System.out.println("Drive bike");	
	}
}

class Splender extends Bike
{
	void run()
	{
		System.out.println("Drive Splender");
	}
}


public class RunTimePolyMethodOverriding {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Splender s=new Splender();//here child class overrides parent class
		s.run();
		//Bike b=new Splender ();
		//b.run();
		
	}

}
