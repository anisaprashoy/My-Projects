package aggrigation;

public class Address 
{
	private String houseName;
	private int houseNo;
	private String city;
	private Employee employee;
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void print()
	{
		System.out.println("Employee Id : "+getEmployee().getId());
		System.out.println("Employee Name : "+getEmployee().getName());
		System.out.println("House Name : "+houseName);
		System.out.println("House Number : "+houseNo);
		System.out.println("City : "+city);
	}
}
