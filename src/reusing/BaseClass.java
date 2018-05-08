package reusing;

import static java.lang.System.*;

class A {
	A(int i) {
		out.println("A constructor with " + i);
	}
}

class B {
	B(float f) {
		out.println("B constructor with " + f);
	}
}

class C extends A {
	private B bb = new B(0.5f);
	C() {
		super(0);
	}
	void f() {
		out.println(bb);
	}
}
public class BaseClass {
	public static void main(String[] args) {
		C cc = new C();
		out.println(cc);
	}
}
