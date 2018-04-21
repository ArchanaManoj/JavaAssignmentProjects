package comm.assnmt.OOPServices;

public class Overloading {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Sum of 2 integers: "+calc.add(12,9));
		System.out.println("Sum of 3 decimals: "+calc.add(3.4, 5.8, 9.8));
		System.out.println("Product of 2 integers: "+calc.mult(4, 34));
		System.out.println("Product of 3 decimals: "+calc.mult(12.5,4.5,6.7));

	}

}
class Calculator{
	
	public int  add(int num1, int num2) {
		return num1+num2;
	}
	
	public double add(double num1, double num2, double num3) {
		return num1+num2+num3;
	}
	public int  sub(int num1, int num2) {
		return num1-num2;
	}
	
	public double mult(double num1, double num2, double num3) {
		return num1*num2*num3;
	}
	public int  mult(int num1, int num2) {
		return num1*num2;
	}
	
	public double  div(double num1, double num2) {
		return num1/num2;
	}
}
