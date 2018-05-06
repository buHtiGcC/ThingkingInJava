package access.util;

public class Range {
	private Range() {}
	public static Range makeRange() {
		return new Range();
	}
	public int[] range(int n) {
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = i;
		return array;
	}
}
