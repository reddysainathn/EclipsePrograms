package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//This is the best way
public class ExceptionsType3 {
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {

			// this message is too vague

			System.out.println("Counld not open file ");
		}
	}

	public static void openFile() throws FileNotFoundException {
		File file = new File("text.txt");

		FileReader fr = new FileReader(file);

	}

}
