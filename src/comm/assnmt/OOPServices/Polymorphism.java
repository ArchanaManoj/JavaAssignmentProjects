package comm.assnmt.OOPServices;

public class Polymorphism {

	public static void main(String[] args) {
		Admin a = new Admin();
		a.setEmployee("Sylvia", 2234, 34.5, 2457.45, "78 SW 67th");
		System.out.println(a.getEmployee().name+", Salary: "+a.getEmployee().salary);
		a.Permissions();
		User u = new User();
		u.setEmployee("Ray", 78965, 45.5, 1290.56, "1254 SE 100th");
		System.out.println(u.getEmployee().name+", Salary: "+u.getEmployee().salary);
		u.Permissions();
	}

}
class Employee{
	String name;
	int empNo;
	double age;
	double salary;
	String address;
	
	public void setEmployee(String name, int empno, double age, double salary, String address) {
		this.name= name;
		this.empNo = empno;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee getEmployee() {
		Employee e = new Employee();
		e.name = this. name;
		e.empNo = this.empNo;
		e.age= this.age;
		e.salary = this.salary;
		e.address = this.address;
		 return e;
	}
}
interface Privileges{
	void Permissions();
}

class Admin extends Employee implements Privileges{
	public void Permissions() {
		System.out.println("Admin has all privileges");
	}
}

class User extends Employee implements Privileges{
	public void Permissions() {
		System.out.println("User has limited privileges");
	}
}
