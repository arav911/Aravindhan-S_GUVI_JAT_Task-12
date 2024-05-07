package task_12_guvi;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListString {

	public static void main(String[] args) {
//		Getting input from user
		Scanner input = new Scanner(System.in);
		ArrayList<String> arrList = new ArrayList<>();
		
//		adding input values to the ArrayList
		for(int i=1; i<=5; i++) {
			System.out.print("Enter the String input "+i+": ");
			arrList.add(input.nextLine());
		}
		
//		printing the ArrayList values before removing them
		System.out.println("ArrayList before removing the values: "+arrList);
//		removing all values from the ArrayList
		arrList.removeAll(arrList);
//		printing the ArrayList values after removing them
		System.out.println("ArrayList after removing the values: "+arrList);

	}

}
