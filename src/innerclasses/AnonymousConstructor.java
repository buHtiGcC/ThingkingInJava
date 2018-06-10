package innerclasses;


abstract class Base {
	public Base(int i) {
		System.out.println("Base constructor, i = " + i);
	}
	public abstract void f();
}
public class AnonymousConstructor {
	public static Base getBase( int i) {
		return new Base(i) {
			private int j = 0;
			{
				if(i < 20) {
					j = i;
				}
				System.out.println("Inner and Anonymous constructor - inside instatnce initialization, j = " + j);				 				
			}
			public void f() {
				System.out.println("Anonymous.f() j = " + j);
			}
		};
	}
	
	public static void main(String[] args) {		
		int i = 10;
		Base base = getBase(i);
		base.f();
		System.out.println(i);
	}
}
