package access.util;

import static java.lang.System.*;

public class Printer {
	private Printer() {	}
	public static Printer makePrinter() {
		return new Printer();
	}
	public void println(Object obj) {
		out.println(obj);
	}
	public void print(Object obj) {
		out.print(obj);
	}
}
