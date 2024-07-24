package comm.assnmnt.day3;
//Create a class Employee.java with attributes empNo, empName, address, State,
//zipCode, phone, designation (manager, Lead, analyst) , experienceinYears,
//emailAddress, basic, hra, bonus (% of basic). Choose appropriate data types and
//create a constructer, getters &amp; setters for the attributes. Also create a method to
//return the total salary (basic + hra + (bonus/100)*basic)

public class Employee {

	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.setEmployee("ABC", "123 SW", 345, "OR", "97006", "76845", Designation.Manager, 3.5, "abc@gmail.com", 3000.0,250.0,100.0);
		System.out.println("Name: "+emp.getEmployee().empName);
		System.out.println("ADDRESS: "+emp.getEmployee().empAddress);
		System.out.println("Employee No: "+emp.getEmployee().empNo);
		System.out.println(emp.getEmployee().empState);
		System.out.println(emp.getEmployee().empZipcode);
		System.out.println(emp.getEmployee().empPhone);
		System.out.println("Designation: "+emp.getEmployee().empDesignation);
		System.out.println("Experience in Years: "+emp.getEmployee().experienceinYears);
		System.out.println(emp.getEmployee().emailAddress);
		System.out.println("Salary: "+emp.getSalary());
	}

}

class Employees{
	String empName;
	int empNo;
	String empAddress;
	String empState;
	String empZipcode;
	String empPhone;
	Designation empDesignation;
	float experienceinYears;
	String emailAddress;
	float basic;
	float hra;
	float bonus;
	


	public void setEmployee(String name, String address, int empNo, String state, String zip, String phone, Designation designation, double experience, String email, double basic, double hra, double bonus) {
		this.empName = name;
		this.empNo = empNo;
		this.empAddress = address;
		this.empState = state;
		this.empZipcode = zip;
		this.empPhone = phone;
		this.empDesignation = designation;
		this.experienceinYears = (float) experience;
		this.emailAddress = email;
		this.basic = (float) basic;
		this.hra = (float) hra;
		this.bonus= (float) bonus;
		
	}
	
	public Employees getEmployee(){
		Employees employee = new Employees();
		employee.empName= this.empName;
		employee.empNo= this.empNo;
		employee.empAddress= this.empAddress;
		employee.empZipcode= this.empZipcode;
		employee.empPhone= this.empPhone;
		employee.empDesignation= this.empDesignation;
		employee.experienceinYears= this.experienceinYears;
		employee.emailAddress= this.emailAddress;
		return employee;
	}
	
	public double getSalary() {
		double salary = this.basic + this.hra + (this.bonus/100)*this.basic;
		return salary;
	}


}
enum Designation{
	Manager, Lead, Analyst
}
