package object;

import java.util.Date;

/** The first Thinking in Java example program with comments. 
 * Display the current date in standard output. 
 * <p> 
 * This class with {@link object.ShowProperties} in same package.
 * @author Chen Chao
 * @version 4.0
 * @since 1.2
 */
public class HelloDate {
	/** Entry point to class and application.
	 * @param args array of string arguments
	 * @throws TestException No exception thrown 
	 */
	public static void main(String[] args) {
		System.out.print("Hello, it's ");
		System.out.println(new Date());
	}

}
