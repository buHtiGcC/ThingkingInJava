package initialization;

class Bowl {
	int marker = 0;
	Bowl(int marker) {
		this.marker = marker;
		System.out.println("Bowl(" + marker + ")");
	}
	void f() {
		System.out.println("I'm bowl " + marker);
	}
}

class Tabel {
	static Bowl b1 = new Bowl(1);
	int marker = 0;
	Tabel(int marker) {
		this.marker = marker;
		System.out.println("Tabel(" + marker + ")");
		b2.f();
	}
	void f() {
		System.out.println("I'm tabel " + marker);
	}
	static Bowl b2 = new Bowl(2);
}

class CupBoard {
	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);
	CupBoard(int marker) {
		this.marker = marker;
		System.out.println("Cupboard(" + marker + ")");
		b4.f();
	}
	int marker = 0;
	void f() {
		System.out.println("I'm cupboard " + marker);
	}
	static Bowl b5 = new Bowl(5);
}
public class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("Creating a new Cupboard in main");
		new CupBoard(1);
		System.out.println("Creating a new Cupboard in main");
		new CupBoard(2);
		tabel.f();
		cupboard.f();
	}
	static Tabel tabel = new Tabel(1);
	static CupBoard cupboard = new CupBoard(3);
}
