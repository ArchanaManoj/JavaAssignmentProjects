package comm.assnmnt.day2;

import java.util.Scanner;

public class OOP1 {
	public static void main(String[] args) {
		int account;
		double balance;
		String name, email;
		Scanner inputValue = new Scanner(System.in);
//		BankAccount bankAccount1 = new BankAccount();
//		System.out.println("Please enter account number and balance");
//		account = inputValue.nextInt();
//		balance = inputValue.nextDouble();
//		bankAccount1.setBankAccount(account, balance);
//		System.out.println("Account: "+bankAccount1.getCustAccount()+"/nName: "+bankAccount1.getCustName()+"/nEmail: "+bankAccount1.getCustEmail()+"/nBalance:"+bankAccount1.getCustBalance());
	
		BankAccount bankAccount2 = new BankAccount();
		System.out.println("Please enter name, email, account number and balance");
		name = inputValue.next();
		email = inputValue.next();
		account = inputValue.nextInt();
		balance = inputValue.nextDouble();
		bankAccount2.setBankAccount(name, email, account, balance);
		System.out.println("Account: "+bankAccount2.getCustAccount()+"\nName: "+bankAccount2.getCustName()+"\nEmail: "+bankAccount2.getCustEmail()+"\nBalance: $"+bankAccount2.getCustBalance());
		bankAccount2.Deposit(250.0);
		inputValue.close();
	}
}
class BankAccount{
	private String custName;
	private String custEmail;
	private int custAccount;
	private double custBalance;
	
	public void setBankAccount(int account, double balance) {
		this.custName = "default name";
		this.custEmail = "Cust@email.com";
		this.custAccount = account;
		this.custBalance = balance;
	}
	public void setBankAccount(String name, String email, int account, double balance) {
		this.custName = name;
		this.custEmail = email;
		this.custAccount = account;
		this.custBalance = balance;
	}
	public String getCustName() {
		return custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public int getCustAccount() {
		return custAccount;
	}
	public double getCustBalance() {
		return custBalance;
	}
	
	public void Deposit(double amount) {
		this.custBalance+=amount;
		System.out.println("New balance: $"+this.custBalance);
	}
	
}
