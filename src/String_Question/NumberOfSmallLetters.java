package String_Question;

public class NumberOfSmallLetters {

	public static void main(String[] args) {

		String str = "Hello Hi what's up";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				count++;
			}

			System.out.println(ch);
		}

		System.out.println("Number of small letters: " + count);
	}
}
