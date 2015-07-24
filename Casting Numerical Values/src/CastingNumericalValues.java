public class CastingNumericalValues {
	// casting is converting to one type to another
	// Before casting memory should be considered
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23335;
		float floatValue = 4854.5f;
		float floatValue2 = (float) 99.3;
		double doubleValue = 43843.54334;
		System.out.println(Double.MAX_VALUE);

		System.out.println(Byte.MAX_VALUE);

		intValue = (int) longValue;

		System.out.println(intValue);

		doubleValue = intValue;

		System.out.println(doubleValue);

		intValue = (int) floatValue;

		System.out.println(intValue);

		// This following won't work as we expect it to!
		// 128 is too big for a Byte.
		byteValue = (byte) 128;
		System.out.println(byteValue);

	}

}
