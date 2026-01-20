package String_Question;

public class NumberOfVowel {

	public static void main(String[] args) {

		String str = "hello Hi what's up";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

				count++;
			}
			System.out.println(ch);
		}

		System.out.println(count);
	}
}
