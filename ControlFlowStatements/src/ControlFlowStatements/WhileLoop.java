package ControlFlowStatements;

public class WhileLoop {
	public static void main(String[] args) {
		boolean loop = 4 < 5;
		int value = 10;
		boolean loop1 = value < 20;
		System.out.println(loop);
		System.out.println(loop1);
		while (value < 20) {
			System.out.println("Hello " +value);
			value = value + 1;
		}
	}
}
