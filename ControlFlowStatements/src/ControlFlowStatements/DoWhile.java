package ControlFlowStatements;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int value;
		// using While Loop
		/*
		 * System.out.println("Enter a Number: "); int value =
		 * scanner.nextInt(); while(value != 5) {
		 * System.out.println("Enter the Value: " ); value = scanner.nextInt();
		 * }
		 */
		// Using Do-While Loop
		do {
			System.out.println("Enter a Number: ");
			value = scanner.nextInt();
		} while (value != 5);

		System.out.println("Got 5!");
	}

}
