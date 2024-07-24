package comm.assnmnt.day1;
import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
//		sum();
//		series();
//		triangle();
		tree();
		}
	
	public static void sum() {
		int nums, sum=0, count=4;
		Scanner inputVal = new Scanner(System.in);
		while(counter > 0) {
			System.out.println("Enter an integer");
	        nums = inputVal.nextInt();
	        sum = sum+nums;
	        System.out.println("Sum is " + sum);
	        counter = counter-1;
		}
		inputVal.close();
	}
	public static void series() {
		int num, limit=0, sum=0;
		Scanner inputVal = new Scanner(System.in);
		System.out.println("This will give the sum of squares of n numbers. Please enter the limit");
		limit = inputVal.nextInt();
		for(int i=0; i<= limit; i++) {
			sum+=i*i;
		}
		System.out.println("Sum is:" +sum);
		inputVal.close();
	}
	public static void triangle() {
		int num, lines;
		Scanner inputVal = new Scanner(System.in);
		System.out.println("This will display pyramid with given number of lines. Please enter the number of lines");
		lines =  inputVal.nextInt();
		for(int i=lines; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		inputVal.close();
	}

	public static void tree() {
		int num, lines, mid;
		Scanner inputVal = new Scanner(System.in);
		System.out.println("This will display tree with given number of lines. Please enter the number of lines");
		lines =  inputVal.nextInt();
		mid = lines/2-3;
		for (int i = 0; i < lines; i++) {
			   for (int j = 0; j < lines - i; j++)
			    System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   System.out.println();
			  }
		for(int m=0; m < lines/2;m++) {
			for(int n=0;n<lines/2+3;n++) {
				System.out.print(" ");
			}
			for(int n=0;n<4;n++) {
				System.out.print("*");
			}
			System.out.println("");
		}
//		for(int i=lines; i>0; i--) {
//			for(int j=i; j>i-1; j--) {
//				System.out.print(" ");
//				for(int k=1; k<=i/2;k++) {
//					System.out.print("*");
//				}
//			}
////			System.out.print("*");
//			
//			System.out.println("");
//		}
	}

}
