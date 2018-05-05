package control;

public class VampireNumbers {
	public static boolean isVampireNumber(int num) {
		if(Integer.toString(num).length() % 2 != 0)
			return false;
		
		return true;
	}
	public static void main(String[] args) {
		int[] digit = new int[4];
		int num1, num2;
		//TODO:Integer.MAX_VALUE
		//ugly code :(
		LoopNumbers:
		for(int i = 1000; i <= 9999; i++) {
			digit[0] = i % 10;
			digit[1] = (i / 10) % 10;
			digit[2] = (i / 100) % 10;
			digit[3] = (i / 1000) % 10;
			for(int n1 = 0; n1 < 4; n1++) 
				for(int n2 = 0; n2 < 4; n2++)
					for(int n3 = 0; n3 < 4; n3++) 
						for(int n4 = 0; n4 < 4; n4++) 
							if(n1 != n2 && n1 != n3 && n1 != n4 && n2 != n3 && n2 != n4 && n3 != n4) {
								if(digit[n2] != 0 || digit[n4] != 0) {
									num1 = digit[n1] * 10 + digit[n2];
									num2 = digit[n3] * 10 + digit[n4];
									if(num1 * num2 == i) {
										System.out.println(i + " = " + num1 + " * " + num2);
										continue LoopNumbers;
									}
								}
							}
		}
	}
}
