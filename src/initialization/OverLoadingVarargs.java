package initialization;

public class OverLoadingVarargs {
	
	static void f(float i, Character...characters) {
		System.out.println("first");
	}
	static void f(Character...characters) {
		System.out.println("econd");
	}
	
	public static void main(String[] args) {
		f(1, 'a');
		//! f('a', 'b'); //ambiguous, both method match
	}
}
