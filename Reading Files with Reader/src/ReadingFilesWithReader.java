import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFilesWithReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");

		// First Way to Buffer File

		BufferedReader br = null;

		try {
			FileReader fr = new FileReader(file);

			// BufferedReader br = new BufferedReader(fr);//Other Way --2nd way

			br = new BufferedReader(fr);

			String line;
			// for reading first line
			// line = br.readLine();

			while ((line = br.readLine()) != null) {

				System.out.println(line);

			}

			// System.out.println(line);

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found :" + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to Read File :" + file.toString());

		}
		
		finally{
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file :" + file.toString());
			} catch (NullPointerException x) {
				// File was probably never opened

				System.out.println("");
			
		}
	/*	try {
			br.close();
		} catch (IOException e) {
			System.out.println("Unable to close file :" + file.toString());
		} catch (NullPointerException x) {
			// File was probably never opened
	
			System.out.println("");
		}*/
	}

}
}
