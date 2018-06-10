package interfaces;

import static java.lang.System.out;

interface IInstrument {
	int VALUE = 6;
	void play(Note n);
	void adjust();
}

class WWind implements IInstrument {
	public void play(Note n) {
		out.println(this + ".play() " + n);
	}
	public String toString() { return "WWind"; }
	@Override
	public void adjust() {} 	
}

class PPercussion implements IInstrument {
	public void play(Note n) {
		out.println(this + ".play() " + n);
	}
	public String toString() { return "PPercussion"; }
	public void adjust() {} 	
}

class SStringed implements IInstrument {
	public void play(Note n) {
		out.println(this + ".play() " + n);
	}
	public String toString() { return "SStringed"; }
	@Override
	public void adjust() {} 	
}

class BBrass extends WWind {
	public String toString() {  return "BBrass"; } 	
}

class WWoodWind extends WWind {
	public String toString() {  return "WWoodWind"; } 		
}

public class InstrumentInterface {
	static void tune(IInstrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(IInstrument[] e) {
		for(IInstrument i : e) 
			tune(i);
	}
	
	public static void main(String[] args) {
		IInstrument[] orchestra = {
				new WWind(),
				new PPercussion(),
				new SStringed(),
				new BBrass(),
				new WWoodWind()

		};
		tuneAll(orchestra);
	}
}
