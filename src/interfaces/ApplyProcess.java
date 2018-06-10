package interfaces;

import static java.lang.System.*;

public class ApplyProcess {
	public static void process(Processor p, Object obj) {
		out.println("Using processor " + p.name());
		out.println(p.process(obj));
	}
}
