package interfaces;

interface CanFight {
	void fight();
}

interface CanFly {
	void fly();
}

interface CanSwim {
	void swim();
}

class ActionCharacter {
	public void PowerFul() {}
	public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {
	public void fly() {}
	public void swim() {}
	//the unimplemented method is inherited from super class, otherwise compile error
}
public class MultiInherit {
	public static void f1(CanFight f) {f.fight();}
	public static void f2(CanFly f) {f.fly();}
	public static void f3(CanSwim f) {f.swim();}
	public static void f4(ActionCharacter f) {f.fight();}
	
	public static void main(String[] args) {
		Hero h = new Hero();
		f1(h);
		f2(h);
		f3(h);
		f4(h);
	}
}
