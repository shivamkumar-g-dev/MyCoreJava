package String_Question;

public class SmallWords {

	public static void main(String[] args) {

		String str = "hi my name is Shivam and i am Fine";
		int count = 0;
		int wordLength = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch != ' ') {
				wordLength++;
			} else {
				if (wordLength > 0 && wordLength <= 3) {
					count++;
				}
				wordLength = 0;
			}
		}

		if (wordLength > 0 && wordLength <= 3) {
			count++;
		}

		System.out.println("Total number of small words: " + count);
	}
}
