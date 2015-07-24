package Arraylist;


import java.util.ArrayList;
import java.util.List;
// Cllection Classes Are grouped by Interfaces
public class ArrayLists {
	public static void main(String[] args) {

		// Default Size of ArrayList is 10
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Adding numbers to ArrayList
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		// Retrieving
		System.out.println(numbers.get(0));

		System.out.println("Iteration #1 :");
		// Indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));

		}

		System.out.println("\nInteration #2 :");
		for (Integer value : numbers) {
			System.out.println(value);
		}

		// Removing Items (Carefully!)

		numbers.remove(numbers.size() - 1);

		// This is very slow

		numbers.remove(0);

		System.out.println("\nInteration #2 :");
		for (Integer value : numbers) {
			System.out.println(value);
		}

		//List Interface
		List<String> Values = new ArrayList<String>();
	}
}
