package comm.assnmnt.day1;
import java.util.Scanner;

public class PayrollPlus {

	public static void main(String[] args) {
		payroll();
		//quad1();
	}
	public static void payroll() {
		double hours, rate, salary;
		Scanner inputVal = new Scanner(System.in);
		System.out.println("This prog will output salary given hours and rate. Please enter number of hours worked per day:");
		hours = inputVal.nextDouble();
		System.out.println("Please enter per hour rate");
		rate = inputVal.nextDouble();
		salary = rate*hours*22;
		System.out.println("Number of hours worked per day:"+hours+"\nRate per hour:"+rate+"\nYour monthly salary:"+salary);
	}
	public static void quad1() {
		int a, b, c;
		double solution;
		System.out.println("This prog would determine the roots of the given quadratic equation: 3*X^2 - 8*X + 4");
		a = 3;
		b = 8;
		c = 4;
		solution = Math.sqrt(b*b - 4*a*c);
		System.out.println("Solution is:"+solution+"Explanation: 3*"+sol+"^2-8*"+sol+"+4");
	}
}
