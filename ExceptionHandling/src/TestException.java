import java.util.Scanner;

public class TestException {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter The Age");
			int c = scanner.nextInt();
			validate(c);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		} finally {
			System.out.println("Finally executed");
		}
	}
}
