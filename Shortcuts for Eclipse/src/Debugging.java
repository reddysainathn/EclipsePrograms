public class Debugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test1 = new Test();

		int value = test1.getInitialValue();

		test1.doStuff(value);

		System.out.println("Starting.");
		System.out.println("Incrementing value.");
		value++;
		value = value - 8;
		System.out.println(value);
		System.out.println("Finishing.");

	}

}
