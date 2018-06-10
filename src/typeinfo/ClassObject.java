package typeinfo;

class MyClass {
	public static int count;
	static {
		count ++;
		System.out.println("MyClass.count = " + count);
	}
	void info() {
		System.out.println("This is info from MyClass");
	}
}

class AnotherClass extends MyClass{
	private static int id;
	static {
		id ++;
		System.out.println("AnotherClass.id = " + id);
	}
	void info() {
		System.out.println("This is info from AnotherClass");
	}
}
public class ClassObject {
	public static void main(String[] args) {
		try {
			//Does not trigger initialization
			Class<?> cl = MyClass.class;
			System.out.println(cl.getCanonicalName());
			System.out.println();
			
			//Does trigger initialization
			Object inst = cl.newInstance();	//same as constructor		
			System.out.println(inst.getClass());
			((MyClass)inst).info();
			System.out.println();
			
			//Does trigger initialization
			Class<?> cll = Class.forName("typeinfo.AnotherClass");
			System.out.println(cll.getCanonicalName());
						
			/* !Compile Error!
			 * Class<Number> numCl = Interger.class;
			 * */
			Class<? extends Number> num = Integer.class;
			num = Double.class;
			num = Number.class;
			num.getName();
			
			Class<AnotherClass> an = AnotherClass.class;
			/* !Compile Error! 
			 * even compiler knows the type is MyClass
			 * Class<MyClass> my = an.getSuperclass();
			 * */
			Class<? super AnotherClass> my = an.getSuperclass();
			/* !Compile Error!
			 * MyClass myObj = my.newInstance();
			 * */
			Object myObj = my.newInstance();
			myObj.getClass();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
