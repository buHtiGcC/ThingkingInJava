package control;

public class ListCharacters {
	public static void main(String[] args) {
		for(char c = 0; c < 128; c++) {
			if(Character.isLetter(c)) {
				System.out.println("value: " + (int)c + " character: " + c);
			}
		}
	}

}
