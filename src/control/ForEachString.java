package control;

public class ForEachString {
	public static void main(String[] args) {
		for(char c : "Hello World".toCharArray())
			System.out.print(c + " ");
	}
}
