package Arrays;

public class ArrayofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "You";
		for (int i = 0; i < words.length; i++) {
			
			System.out.println(words[i]);
		}
		System.out.println("\n" + words[2]+"\n");
		
		String[] fruits = {"apple","kiwi","banana","pear"};
		
		for(String fruit: fruits)
		{
			System.out.println(fruit);
		}
		//int assigns memory,int is primitive
		int value = 123;
		
		//String is non-primitive (Its a class),It is a reference 
		String text = null ;
		
		System.out.println(text);
		//Allocating reference to strings not allocating memory
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		//allocating memory to the string reference
		texts[0]="One";
		
		
	}
}
