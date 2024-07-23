package comm.assnmnt.collections;

import java.util.*;

public class ArrayListServices {

	public static void main(String[] args) {
//		ColorsOp();
//		SortArray();
		if(CompareArray()) {
			System.out.println("Arrays are identical");
		}else {
			System.out.println("Arrays are not identical");
		}
	}
	public static void ColorsOp() {
		ArrayList<String> colors1 = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		colors1.add("Black");
		colors2.add("Peach");
		colors2.add("lilac");
		colors2.add("Turqoise");
		colors1.addAll(colors2);
		System.out.println(colors1);
		System.out.println(colors1);
	}
	
	public static void SortArray() {
		Scanner inputVal = new Scanner(System.in);
		int arrSize;
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		System.out.println("Enter the size of the list: ");
		arrSize = inputVal.nextInt();
		System.out.println("Enter list of integers: ");
		for(int i=0; i<arrSize; i++) {
			int num = inputVal.nextInt();
			numArray.add(num);
		}
		Collections.sort(numArray);
		System.out.println("Sorted Array List"+numArray);
		inputVal.close();
		}
	public static Boolean CompareArray() {
		Scanner inputVal = new Scanner(System.in);
		int arrSize;
		Boolean identical = true;
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		System.out.println("Enter the size of the first array: ");
		arrSize = inputVal.nextInt();
		System.out.println("Enter the first Array: ");
		for(int i=0; i<arrSize; i++) {
			int elem = inputVal.nextInt();
			array1.add(elem);
		}
		System.out.println("Enter the size of the second array: ");
		arrSize = inputVal.nextInt();
		System.out.println("Enter the second Array: ");
		for(int i=0; i<arrSize; i++) {
			int elem = inputVal.nextInt();
			array2.add(elem);
		}
		if(array1.size() == array2.size()) {
			for(int i=0; i<array1.size(); i++) {
				if(array1.get(i)==array2.get(i)) {
					identical = true;
				}else {
					identical = false;
					break;
				}
			}
		}
		inputVal.close();
		return identical;
	}
		
	}



