package Enums;

//Enum is Enumuration
public class Enums {

	// public static final int DOG = 0;
	// public static final int CAT = 1;
	// public static final int MOUSE = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int animal = CAT;
		Animal animal = Animal.DOG;
		switch (animal) {
		case CAT:

			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;

		/*
		 * case DOG: System.out.println("Dog"); break; case CAT:
		 * System.out.println("Cat"); break;
		 */

		}
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		// instanceof operator tells whether the Object belongs to particular
		// class of not
		System.out.println(Animal.DOG instanceof Animal);

		System.out.println(Animal.MOUSE.getName());

		System.out.println(Animal.CAT.toString());

		// /to get the name of Enumerated constant(CAT,DOG,MOUSE)
		System.out.println("Enum Name as a String : " + Animal.CAT.name());
		
		//to get the Enum value
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println("\nThe Enum Value is "+animal2);
	}

}
