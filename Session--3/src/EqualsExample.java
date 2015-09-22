
//equals() method compares the two given strings based on the content of the string.
//If any character is not matched, it returns false. If all characters are matched, it returns true
public class EqualsExample {
	public static void main(String args[]) {
		String s1 = "java";
		String s2 = "java";
		String s3 = "JAVA";
		String s4 = "SCALA";
		System.out.println(s1.equals(s2));
											
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}