package interfaces;

class OuterClass {
	interface InterfaceA {
		void f();
	}
	public class InnerClassA implements InterfaceA {
		public void f() {}
	}
	private class InnerClassAA implements InterfaceA {
		public void f() {}
	}
	
	public interface InterfaceB {
		void f();
	}
	public class InnerClassB implements InterfaceB {
		public void f() {}
	}
	private class InnerClassBB implements InterfaceB {
		public void f() {}
	}
	
	private interface InterfaceC {
		void f();
	}
	public class InnerClassC implements InterfaceC {
		public void f() {}
	}
	private class InnerClassCC implements InterfaceC {
		public void f() {}
	}
	private InterfaceC ref;
	public InterfaceC getInterfaceC() {return new InnerClassC(); }
	public void setInterfaceCRef(InterfaceC ref) {
		this.ref = ref;
		this.ref.f();
	}
	
}

interface OuterInterface {
	interface InnerInterface {
		void f();
	}
	//! private interface TestInner { } : interface member can not be private, even inner interface
	void g();
}
public class NestedInterface {
	class Tester1 implements OuterClass.InterfaceA {
		public void f() {}
	}
	class Tester2 implements OuterClass.InterfaceB {
		public void f() {}
	}
	//class Tester3 implements OuterClass.InterfaceC { public void f() {}	} !Cannot implement private interface outside the defining class
	class Tester4 implements OuterInterface {
		public void g() {}
		public void f() {}
	}
	class Tester5 implements OuterInterface.InnerInterface {
		public void g() {}
		public void f() {}
	}
	class Tester6 implements OuterInterface {
		public void g() {}
		class Tester7 implements OuterInterface.InnerInterface {
			public void f() {}
		}
	}
	
	public static void main(String[] args) {
		OuterClass cl = new OuterClass();
		OuterClass.InnerClassC inCL = (OuterClass.InnerClassC)cl.getInterfaceC();
		//cl.getInterfaceC().f(); !Cannot access member of private interface, the interface type not visible
		new OuterClass().setInterfaceCRef(cl.getInterfaceC());
		new OuterClass().setInterfaceCRef(inCL);
	}
}
