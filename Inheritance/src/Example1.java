/*
 * ______________
   |     A       |
   |       int a |
   |_____________|
         |   
         |
         |
   --------------
   |    B        |
   |      int b  |
   |_____________|
 */
class A {
	private int a;

	public A(int a) {
		this.a = a;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public boolean zero() {
		return a == 0;
	}

	public int oneMore() {
		return a++;
	}
}

class B extends A {
	private int b;

	public B(int a, int b) {
		super(a);
		this.b = b;
		// TODO Auto-generated constructor stub

	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return super.getA();
	}

	public boolean isZero() {
		return b == 0 && super.zero();
	}

	public String toString() {
		return "the value of a  in class-A is " + super.getA()
				+ " \nThe value of a in class-B is " + getA()
				+ "\n the value of b in class-B is " + getB();

	}
}

public class Example1 {

	public static void main(String[] args) {

		A a = new A(2);
		B b = new B(3, 4);

		a.setA(4);
		System.out.println(b.toString());

	}
}
