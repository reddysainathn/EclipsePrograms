package iterators;

public class ImplementingIterablee {
	
	String str ="JAVA";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UrlLibrarys urlLibrary = new UrlLibrarys();

		for (String html : urlLibrary) {
			System.out.println(html.length());
			// System.out.println(html);
		}

		// Simple iterator
		/*
		 * for (String url : urlLibrary) { System.out.println(url); }
		 */
	}

}
