import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// String filename = "C:/Users/Sainath Reddy/Desktop/example.txt";
		String filename = "example.txt";
		File textFile = new File(filename);

		Scanner in = new Scanner(textFile);

		int count = 2;
		int value = in.nextInt();
		System.out.println("Read value: " + value);

		in.nextLine();

		while (in.hasNext()) {
			String line = in.nextLine();
			System.out.println(count + ":" + line);
			count++;
		}

		in.close();

	}

}
