package comm.assnmnt.collections;

import java.util.*;
public class LinkedListServices {

	public static void main(String[] args) {
		//SimpleOps();
//		ListReverse();
		InsertElem();

	}
	public static void SimpleOps() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Apple");
		list1.add("Pear");
		list1.add("Grape");
		list1.add("Mango");
		list1.add("Orange");
		
		System.out.println(list1);
		for(int i=0; i<list1.size();i++) {
			System.out.println("The "+i+"th element is: "+list1.get(i));
		}
	}
	
	public static void ListReverse() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Icecream");
		list1.add("Chocolate");
		list1.add("Candy");
		list1.add("Eclair");
		list1.add("Pastry");
		System.out.println("The List: "+list1);
		Iterator iter = list1.descendingIterator();
		System.out.println("Reversed Linked list:");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static void InsertElem() {
		Scanner inputVal = new Scanner(System.in);
		LinkedList<String> list1 = new LinkedList<String>();
		System.out.println("Enter the size of the list: ");
		int listSize = inputVal.nextInt();
		System.out.println("Enter the list: ");
		for(int i=0; i<listSize; i++) {
			list1.add(i,inputVal.next());
		}
		System.out.println("Enter the position of list where to enter new element: ");
		int pos = inputVal.nextInt();
		System.out.println("Enter the element: ");
		String elem = inputVal.next();
		list1.add(pos,elem);
		System.out.println(list1);
		inputVal.close();
	}

}
