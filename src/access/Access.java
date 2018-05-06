package access;

import access.util.*;

public class Access {
	public static void main(String[] args) {
		Printer printer = Printer.makePrinter();
		for(int i: Range.makeRange().range(10)) {
			printer.println(i);
		}
	}
}
