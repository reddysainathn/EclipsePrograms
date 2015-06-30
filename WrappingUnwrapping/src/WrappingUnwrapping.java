public class WrappingUnwrapping { 
	public static void main(String args[]) {	
		// data types 
		byte grade = 2; 
		int marks = 50; 
		float price = 8.6f; 
		// observe a suffix of <strong>f</strong> for float
		double rate = 50.5; 
		// data types to objects	
		Byte g1 = new Byte(grade); 
		// wrapping 
		Integer m1 = new Integer(marks);
		Float f1 = new Float(price);
		Double r1 = new Double(rate); 
		// let us print the values from objects 
		System.out.println("Values of Wrapper objects (printing as objects)");
		System.out.println("Byte object g1: " + g1);
		System.out.println("Integer object m1: " + m1); 
		System.out.println("Float object f1: " + f1); 
		System.out.println("Double object r1: " + r1); 
		// objects to data types (retrieving data types from objects) 
		byte bv = g1.byteValue(); 
		// unwrapping 
		int iv = m1.intValue(); 
		float fv = f1.floatValue(); 
		double dv = r1.doubleValue();
		// let us print the values from data types	
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv); 
		System.out.println("int value, iv: " + iv);
		System.out.println("float value, fv: " + fv);
		System.out.println("double value, dv: " + dv); } 
	} 
