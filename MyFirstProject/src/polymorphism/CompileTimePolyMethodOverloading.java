package polymorphism;
//polymorphism is the concept in which a single operation can perform in different ways
//method overloading happens in polymorphism
//method overloading is a compile time polymorphism
//method overloading doesn't depends on return type
//method overloading depends on data type of parameter and number of parameters
//method overloading happens only in static method
class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	static float add(float a,int b)
	{
		return a+b;
	}
	static float add(float a,float b)
	{
		return a+b;
	}
	static String add(String a)
	{
		return a;
	}
}

public class CompileTimePolyMethodOverloading
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Sum of 2 int nos : "+Adder.add(11,12));
		System.out.println("Sum of 3 int nos : "+Adder.add(11,12,13));
		System.out.println("Sum of 1 int and 1 float nos : "+Adder.add(12.4f,12));
		System.out.println("Sum of 2 float nos : "+Adder.add(12.4f,21.1f));
		System.out.println("Name : "+Adder.add("Anisa"));
	}
}
