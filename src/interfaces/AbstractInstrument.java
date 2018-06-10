package interfaces;

import static java.lang.System.*;
enum Note {
	MIDDLE_C, C_SHARP, B_FLAT;
}

abstract class Instrument {
	private int i;
	public abstract void play(Note n);
	public String what() { return "Instrument"; }
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		out.println("Wind.play() " + n);
	}
	@Override
	public String what() { return "Wind"; }
	@Override
	public void adjust() {} 	
}

class Percussion extends Instrument {
	public void play(Note n) {
		out.println("Percussion.play() " + n);
	}
	@Override
	public String what() { return "Percussion"; }
	public void adjust() {} 	
}

class Stringed extends Instrument {
	public void play(Note n) {
		out.println("Stringed.play() " + n);
	}
	@Override
	public String what() { return "Stringed"; }
	@Override
	public void adjust() {} 	
}

class Brass extends Wind {
	public void play(Note n) {
		out.println("Brass.play() " + n);
	}
	@Override
	public void adjust() { out.println("Brass.adjust()"); } 	
}

class WoodWind extends Wind {
	@Override
	public void play(Note n) {
		out.println("WoodWind.play() " + n);
	}
	@Override
	public String what() { return "WoodWind"; } 	
}

public class AbstractInstrument {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e) 
			tune(i);
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new WoodWind()
		};
		tuneAll(orchestra);
	}
}
