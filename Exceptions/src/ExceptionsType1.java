import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsType1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("test.txt");
		
		FileReader fr = new FileReader(file);
		

	}

}
