package comm.assnmnt.day1;

import java.util.Scanner;

public class prog1 {
	public static void main(String[] args) {
//		discount1();
//		discount2();
		discount3();
	}

	public static void discount1() {
		double price, discountedPrice;
		Scanner inputPrice = new Scanner(System.in);
		System.out.println("This prog will calculate 5% discount for entered price. Please enter price");
		price = inputPrice.nextDouble();
		discountedPrice = price-price*0.05;
		System.out.println("Discounted price is:"+discountedPrice);
	}
	
	public static void discount2() {
		double price, discountedPrice;
		Scanner inputPrice = new Scanner(System.in);
		System.out.println("This prog will calculate 5% discount for entered price if price is greater than 10.0. Please enter price");
		price = inputPrice.nextDouble();
		if(price > 10.0) {
			discountedPrice = price-price*0.05;
			System.out.println("Discounted price is:"+discountedPrice);
		}else {
			System.out.println("No discount");
		}
		
	}
	
	public static void discount3() {
		double price =0, discountedPrice;
		int cookie,cake;
		Scanner inputVal = new Scanner(System.in);
		System.out.println("This prog will calculate 5% discount for entered prices and items. Please enter quantity of cookies");
		cookie = inputVal.nextInt();
		price = price+cookie*5;
		System.out.println("Please enter quanity of cake");
		cake= inputVal.nextInt();
		price=price+cake*3;
		price = price/100.0;
		if(price > 10.0) {
			discountedPrice = price-price*0.05;
			System.out.println("Discounted price is:"+discountedPrice);
		}else {
			System.out.println("No discount");
		}
		
	}
}
