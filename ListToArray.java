package task_12_guvi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListToArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Creating a LinkedList of int type by declaring object of List
		List<Integer> list = new ArrayList<Integer>();

		// Adding custom element to LinkedList using add() method
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter input "+i+": ");
			list.add(input.nextInt());
		}
		
		// Printing elements of list
		System.out.println(list);

		// Storing it inside array of int values
		int[] arr = new int[list.size()];

		// Converting ArrayList to Array using get() method
		for (int i = 0; i < list.size(); i++)
			arr[i] = list.get(i);

		// Printing elements of array
		for (int x : arr)
			System.out.print(x + " ");
	}
}
