package interfaces;

import static java.lang.System.*;

abstract class Base1 {
	public abstract void print();
}

class Derived1 extends Base1 {
	private int i = 9;
	Derived1() {
		print();
		i = 10;
	}
	public void print() {
		out.println("Derived1: i = " + i);
	}
}

abstract class Base2 {
	public abstract void print();
}

class Derived2 extends Base2 {
	private int i = 9;
	Derived2() {
		i = 10;
	}
	public void print() {
		out.println("Derived2: i = " + i);
	}
}

public class InterfaceTests {
	static void testBase2(Base2 tt) {
		tt.print();
	}
	public static void main(String[] args) {
		testBase2(new Derived2());
		Derived1 obj = new Derived1();
		obj.print();
	}
}
