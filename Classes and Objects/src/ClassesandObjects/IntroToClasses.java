
package ClassesandObjects;
class Person
{
	//Instance variables(data or "State")
	String name;
	int age;
	
	
	//classes can contain
	
	//1.Data
	//2.Subroutines(Methods)
	
	
}
public class IntroToClasses {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello  There");
		Person person1 = new Person(); 
		person1.name = "Joe Blogs";
		person1.age = 37;
		 System.out.println(person1.name );
		 System.out.println(person1.age);

		 Person person2 =new Person();
		 person2.name = "Sarah James";
			person2.age = 20;
			System.out.println(person2.name);
			System.out.println(person2.age);
			
	}

}
