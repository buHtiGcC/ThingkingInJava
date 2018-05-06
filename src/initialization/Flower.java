package initialization;

public class Flower {
	int petalCount = 0;
	String colour = "";
	Flower(String colour) {
		this.colour = colour;
		System.out.println("Constructor with flower colour: " + this.colour);
	}
	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor with flower petal: " + petalCount);
	}
	Flower(int petals, String colour) {
		this(petals);
		this.colour = colour;
		System.out.println("Constructor with flower petal: " + petalCount + " and colour: " + this.colour);
	}
	Flower() {
		this(5, "Purple");
		System.out.println("Default constructor" + " setting petal: " + petalCount + " colour: " + colour);
	}
	
	void printFlowerInfo() {
		System.out.println("Flower petal: " + petalCount + " colour: " + colour);
	}
	
	public static void main(String[] args) {
		Flower f = new Flower();
		f.printFlowerInfo();
	}
}
