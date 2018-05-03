package operators;

import java.util.Random;

public class MathOps {
	public static void main(String[] args) {
		// Create seeded random generator
		Random rand = new Random(47);
		int i, j, k;
		j = rand.nextInt(100) + 1;
		System.out.println("j: " + j);
		k = rand.nextInt(100)  + 1;
		System.out.println("k: " + k);
		i = j + k;
		System.out.println("j + k: " + i);
		i = j - k;
		System.out.println("j - k: " + i);
		i = j / k;
		System.out.println("j / k: " + i);
		i = j * k;
		System.out.println("j * k: " + i);
		i = j % k;
		System.out.println("j % k: " + i);
		j %= k;
		System.out.println("j %= k: " + j);
		
		// Float number
		float u, v, w;
		v = rand.nextFloat();
		System.out.println("v: " + v);
		w = rand.nextFloat();
		System.out.println("v: " + w);
		u = v + w;
		System.out.println("v + w: " + u);
		u = v - w;
		System.out.println("v - w: " + u);
		u = v * w;
		System.out.println("v * w: " + u);
		u = v / w;
		System.out.println("v / w: " + u);
		// It also works for char, byte, short, int, long, and double
		u += v;
		System.out.println("u += v: " + u);
		u -= v;
		System.out.println("u -= v: " + u);
		u *= v;
		System.out.println("u *= v: " + u);
		u /= v;
		System.out.println("u /= v: " + u);
	}
}
