package interfaces.filters;

import interfaces.ApplyProcess;
import interfaces.Processor;

class FilterAdapter implements Processor {
	Filter filter;
	FilterAdapter(Filter filter) { this.filter = filter; }
	public String name() { return filter.name(); }
	//! public WaveForm process(WaveForm input) Error
	public WaveForm process(Object input) {
		return filter.process((WaveForm)input); 
	}
}
public class FilterProcessor {
	public static void main(String[] args) {
		WaveForm w = new WaveForm();
		ApplyProcess.process(new FilterAdapter(new LowPass(1.0)), w);
		ApplyProcess.process(new FilterAdapter(new HighPass(8.0)), w);
		ApplyProcess.process(new FilterAdapter(new BandPass(0.5, 10.0)), w);
	}
}

