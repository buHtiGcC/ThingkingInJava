package innerclasses;

class WithInner {
	class Inner {
		
	}
}
public class InheritInner extends WithInner.Inner{
	InheritInner(WithInner wi) {
		wi.super();
	}
	void f() {}
	
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner iinner = new InheritInner(wi);
		iinner.f();
	}
}
