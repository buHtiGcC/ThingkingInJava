package object;

public class Reference {
	static void testChangeRef(Integer val) {
		System.out.println("val : " + val);
		val = new Integer(10);
		System.out.println("val : " + val);
	}

	public static void main(String[] args) {
		Integer intVal = new Integer(0);
		System.out.println("intVal : " + intVal);
		testChangeRef(intVal);
		System.out.println("intVal : " + intVal);
	}
}
