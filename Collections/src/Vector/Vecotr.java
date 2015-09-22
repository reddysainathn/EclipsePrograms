package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vecotr {

	public static void main(String args[]) {

		// creating vector
		Vector<String> v = new Vector<String>();
		v.add("umesh");
		v.addElement("irfan");
		v.addElement("kumar");

		// traversing elements using Enumeration
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
