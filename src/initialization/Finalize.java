package initialization;

class Book {
	boolean checkOut = false;
	Book (boolean checkout) {
		checkOut = checkout;
	}
	void checkIn() {
		checkOut = false;
	}
	protected void finalize() {
		try {
			if(checkOut) {
				System.out.println("Error: book is still checked out");
				super.finalize();
			}
		}catch (Throwable ex) {
			System.out.println(ex);
		}
	}
}
public class Finalize {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}
