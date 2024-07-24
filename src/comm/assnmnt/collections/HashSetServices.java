package comm.assnmnt.collections;

import java.util.*;
public class HashSetServices {

	public static void main(String[] args) {
//		SimpleOps();
		HashPractice();
	}
	
	public static void SimpleOps() {
		HashSet<String> hsh1 = new HashSet<String>();
		hsh1.add("Honda");
		hsh1.add("Subaru");
		hsh1.add("Volvo");
		hsh1.add("Chevrolet");
		int size = hsh1.size();
		System.out.println("The size of the Hashset is: "+size);
		System.out.println("HashList: "+hsh1);
		ArrayList<String> arrList = new ArrayList<String>(hsh1);
		System.out.println("ArrayList:"+arrList);
	}
	
	public static void HashPractice() {
		HashSet<Customer> customerSet= new HashSet<Customer>();
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		Customer customer4 = new Customer();
		customer1.setCustomer("Addy", 1234, "234 NW 5th", "98768768");
		customerSet.add(customer1);
		customer2.setCustomer("Gilly", 3456, "234 NW 5th", "98768768");
		customerSet.add(customer2);
		customer3.setCustomer("Fanny", 5678, "234 NW 5th", "98768768");
		customerSet.add(customer3);
		customer4.setCustomer("Peggy", 6789, "234 NW 5th", "98768768");
		customerSet.add(customer4);
		Iterator<Customer> iter = customerSet.iterator();
		 
		while (iter.hasNext())
		{
		    Customer customer = (Customer) iter.next();
		 
		    System.out.println(customer.getCustomer().accountNo+","+customer.getCustomer().name+","+customer.getCustomer().address+","+customer.getCustomer().phone);
		}
	}

}
class Customer{
	String name;
	int accountNo;
	String address;
	String phone;
	
	public void setCustomer(String name, int act, String addr, String phone) {
		this.name=name;
		this.accountNo = act;
		this.address = addr;
		this.phone = phone;
	}
	
	public Customer getCustomer() {
		Customer cust1 = new Customer();
		cust1.name = this.name;
		cust1.accountNo = this.accountNo;
		cust1.address = this.address;
		cust1.phone = this.phone;
		return cust1;
	}
}

