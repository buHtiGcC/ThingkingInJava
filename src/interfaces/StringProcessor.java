package interfaces;

import java.util.Arrays;
import static java.lang.System.*;

class SProcessor {
	public String name() {
		return getClass().getSimpleName();
	}
	Object process(Object input) { return input; }
}

class Upcase extends SProcessor {
	@Override
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends SProcessor {
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends SProcessor {
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

public class StringProcessor {
	public static void process(SProcessor p, Object s) {
		out.println("Using processer " + p.name());
		out.println(p.process(s));
	}
	public static String s = "This is strategy design mode test";
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}
