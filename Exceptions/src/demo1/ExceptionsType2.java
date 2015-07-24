package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");

		try {
			FileReader fr = new FileReader(file);
			// This will not be executed if the exception is thown
			System.out.println("Continuing.....");

		} catch (FileNotFoundException e) {
			System.out.println("File not Found :" + file.toString());
		}
		
		System.out.println("Finished.");
	}

}
