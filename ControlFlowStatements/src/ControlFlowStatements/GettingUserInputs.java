package ControlFlowStatements;

import java.util.Scanner;

public class GettingUserInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a scanner object
		Scanner input = new Scanner(System.in) ;
		Scanner inputInt = new Scanner(System.in) ;
		Scanner inputDouble = new Scanner(System.in) ;
		//output of prompt
		System.out.println("Enter a line of text:");
		System.out.println("Enter a Integer:");
		System.out.println("Enter a floating point number:");
		//wait for the user to enter a line of text
		String line = input.nextLine();
		int value = input.nextInt();
		double fraction = input.nextDouble();
		//tell them what they entered
		System.out.println("You Entered Text: '"  +line+" And the value is "+value+" The Floating value is "+fraction+ "'");
		
		
	}

}
