package ControlFlowStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter a Command");
	String text = input.nextLine();
	switch(text){
	case "start":
		System.out.println("Machine Started!");
		break;
	case "stop":
		System.out.println("Machine Stopped");
		break;
	default:
		System.out.println("Command not recognised");	
		
	}
	}

}
