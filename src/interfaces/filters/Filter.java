package interfaces.filters;

class WaveForm {
	private static long counter;
	private final long id = counter++;
	public String toString() { return "WaveForm id: " + id; }
}

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public WaveForm process(WaveForm input) { return input; }
}

class LowPass extends Filter {
	double cutoff;
	LowPass(double cutoff) { this.cutoff = cutoff; }
}

class HighPass extends Filter {
	double cutoff;
	HighPass(double cutoff) { this.cutoff = cutoff; }
}

class BandPass extends Filter {
	double lowCutoff, highCutoff;
	BandPass(double lowCutoff, double highCutoff) {
		this.lowCutoff = lowCutoff; 
		this.highCutoff = highCutoff;
	}
}