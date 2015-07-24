import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Reading objects...");

		// The best way to write serializable method

		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream(
				"test.txt"));) {
			// In read no constructor is called
			Person person = (Person) oi.readObject();

			System.out.println(person);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
