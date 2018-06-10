package innerclasses;

import static java.lang.System.*;

public class Outer {
	private String ss;
	Outer() {
		ss = "I'm member of outer class";
	}
	class Inner {
		Inner() {
			out.println("I'm inner class");
		}
		public String toString() { return ss; }
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getInner();
		//Outer.Inner inn = new Outer.Inner(); !error, inner object should be enclosed with outer object
		Outer.Inner in = outer.new Inner();
		out.println(in);
	}
}
