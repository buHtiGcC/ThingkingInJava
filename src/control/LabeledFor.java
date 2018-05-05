package control;

public class LabeledFor {
	public static void main(String[] args) {
		int i = 0;
		outer:
		for(; i >= 0; i--) {
			inner:
			for(; i < 10; i++) {
				System.out.println("i = " + i);
				
				if(i == 2) {
					System.out.println("continue");
					continue;
				}
				
				if(i == 3) {
					System.out.println("break");
					i += 2;
					break;
				}
				
				if(i == 7) {
					System.out.println("continue outer");
					i += 3;
					continue outer;
				}
				
				if(i == 8) {
					System.out.println("break outer");
					break outer;
				}
				
				if(i == 9) {
					System.out.println("continue outer");
					continue outer;
				}
				
				for(int k = 0; k < 5; k++) {
					if(k == 3) {
						System.out.println("continue inner");
						continue inner;
					}
				}
			}
		}
	}
}
