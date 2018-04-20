package comm.assnmnt.day3;

import java.util.Scanner;

public class Exercise1To5 {

	public static void main(String[] args) {
		//Fibonacci();
		Calculator c = new Calculator();
		//c.getChoice();
	}
	
	public static void Fibonacci() {
		int limit, num=1, next=1, prev=1;
		Scanner inputValue = new Scanner(System.in);
		System.out.println("Please enter the limit");
		limit = inputValue.nextInt();
		System.out.println(num+"\n"+num);
		for(int i=0; i<=limit; i++) {
			num = prev+next;
			next = prev;
			prev= num;
			System.out.println(num);
		}
		inputValue.close();
	}
	

}

class Calculator{
	public static void getChoice() {
		Scanner inputValue= new Scanner(System.in);
		int choice;
		double num1, num2;
		System.out.println("Please enter 2 numbers");
		num1 = inputValue.nextDouble();
		num2 = inputValue.nextDouble();
		System.out.println("Please enter 1.Add 2.Subtract 3.Multiply 4. Divide");
		choice = inputValue.nextInt();
		switch(choice){
		case 1:
			System.out.println("Sum = "+Add(num1, num2));
			break;
		case 2:
			System.out.println("Difference = "+Subtract(num1, num2));
			break;
		case 3:
			System.out.println("Product = "+Multiply(num1, num2));
			break;
		case 4:
			System.out.println("Quotient = "+Divide(num1, num2));
			break;
			
		}
	}
	static double Add(double a, double b) {
		return a+b;
	}
	static double Subtract(double a, double b) {
		return a-b;
	}
	static double Multiply(double a, double b) {
		return a*b;
	}
	static double Divide(double a, double b) {
		return a/b;
	}
}
