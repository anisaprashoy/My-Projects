package abstraction2;

public class Contractor extends Employee
{
	int workingHours;
	float paymentPerHour=500;	
    float salary;
    boolean premanentEmp;
    boolean permanentEmp; 
    
	public void calculateSalary()
	{
			System.out.println("Contractor");	
	}
	public void calculateSalaryContractor()
	{
		workingHours=5;
		salary=paymentPerHour*workingHours;
		System.out.println("Slary of Contractor : "+salary);
	}

}
