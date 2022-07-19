package aggrigation;

public class EmployeeDetails 
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setId(123);
		e1.setName("Niya");
		Address a1=new Address();
		a1.setHouseName("Saupanika");
		a1.setHouseNo(14);
		a1.setCity("TVM");
		a1.setEmployee(e1);
		a1.print();
		
		Employee e2=new Employee();
		e2.setId(342);
		e2.setName("Miya");
		Address a2=new Address();
		a2.setHouseName("Dreams");
		a2.setHouseNo(23);
		a2.setCity("Kollam");
		a2.setEmployee(e2);
		
		
	}
}
