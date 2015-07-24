import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {

		System.out.println("Writing objects...");

		Person[] people = { new Person(1, "Sue"), new Person(2, "Mike"),
				new Person(7, "Bob") };

		ArrayList<Person> peopleList = new ArrayList<Person>(
				Arrays.asList(people));

		try (FileOutputStream fs = new FileOutputStream("people.txt")) {

			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(people);
			// System.out.println(people);

			os.writeObject(peopleList); 
		
			// Serialize object by Object
			
			os.writeInt(peopleList.size());
			
			for(Person person : peopleList)
			{
				os.writeObject(person);
			}

			os.close();
			System.out.println();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
