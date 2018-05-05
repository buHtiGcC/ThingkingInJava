package control;

public class Fibonacci {
	public static void main(String[] args) {
		int prevNum1 = 1;
		int prevNum2 = 1;
		int curNum = 1;
		for(int i = 0; i < Integer.valueOf(args[2]); i++) {
			if(i >= 2) {
				curNum = prevNum1 + prevNum2;
				prevNum1 = prevNum2;
				prevNum2 = curNum;
			}
			System.out.print(curNum + " ");
		}
		System.out.println();
	}
}
