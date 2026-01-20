package String_Question;
public class NumberOfChars {

	public static void main(String[] args) {

		String str = "hello Hi what's up";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch != ' ') {
				count++;
			}
			System.out.println(ch);
		}

		System.out.println(count);

	}

}