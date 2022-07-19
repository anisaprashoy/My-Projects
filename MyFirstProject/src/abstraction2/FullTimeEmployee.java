package abstraction2;

public class FullTimeEmployee extends Employee
{   
	final int FIXEDHOUR=8;
    float salaryPerHour =1000;
    float salary;
	public void calculateSalary()
	{
			System.out.println("Permanent Employee");	
	}
	
	public void calculateSalaryFullTimeEmployee()
	{
		
		salary=salaryPerHour*FIXEDHOUR;
		System.out.println("Salary of Permanent Employee : "+salary);
	}


}
