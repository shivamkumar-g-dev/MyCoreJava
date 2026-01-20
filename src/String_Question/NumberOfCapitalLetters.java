package String_Question;

public class NumberOfCapitalLetters  {

	public static void main(String[] args) {

		String str = "Hello Hi What’s Up`";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {
				count++;
			}
			
			System.out.println(ch);
		}

		System.out.println("Number of capital letters: " + count);
	}
}
 