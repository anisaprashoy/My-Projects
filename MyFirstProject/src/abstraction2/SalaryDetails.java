package abstraction2;

public class SalaryDetails {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FullTimeEmployee f1=new FullTimeEmployee();
		f1.calculateSalary();
		f1.calculateSalaryFullTimeEmployee();

		Contractor c1=new Contractor();
		c1.calculateSalary();
		c1.calculateSalaryContractor();
		
	}

}
