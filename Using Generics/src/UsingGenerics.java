import java.util.ArrayList;
import java.util.HashMap;

/*
 * Using Generics class is a class that can work with other objects 
 * and we can specify what object we can work when we instantiate the class
 */

class Animal{
	
}
public class UsingGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using ArrayList we can manage array by adding or removing elements

		// /////Before JAVA 5////
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("Orange");

		String fruit = (String) list.get(1);
		System.out.println(fruit);

		// In JAVA-5 Genetrics were introduced

		// ///////Modern Style////////////////
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		String animal = strings.get(2);
		System.out.println(animal);

		/*
		 * There can be more than one type of argument
		 */

		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		
		/*
		 * JAVA-7 Style
		 */
		ArrayList<Animal> someList = new ArrayList<>(); 

		
		
	}
}
