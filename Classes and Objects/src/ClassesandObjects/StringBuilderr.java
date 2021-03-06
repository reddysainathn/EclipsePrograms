package ClassesandObjects;

public class StringBuilderr {
	public static void main(String[] args) {
		// Inefficient
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		System.out.println(info);
		// Efficient way
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a tamer.");
		System.out.println(sb.toString());
		StringBuilder s = new StringBuilder("");
		s.append("My name is Roger").append(" ").append("I am a SkyDiver");
		System.out.println(s.toString());
		// StringBuffer is a Thread safe version of StringBuilder
		
		// Formatting/////
		System.out
				.println("Hers is some Text.\t That was a TAB\nThat was a new line");
		
		// Formatting Integers
		System.out.printf("Total cost %10d;Quantity is %d", 5, 120);
		
		// Formatting String
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-2d:%s\n", i, "some text here ");
		}
		
		// Formatting Floating point vlaues
		System.out.printf("Total value : %.2f\n", 5.6783);
		System.out.printf("Total value : %-6.1f", 343.3423);
	}
}
