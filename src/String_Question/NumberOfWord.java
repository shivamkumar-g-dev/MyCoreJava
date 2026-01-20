package String_Question;

public class NumberOfWord  {

	public static void main(String[] args) {
		
		String str = "Hello Hi what's up";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == ' ') {
				count++;
			}
		}
		
		System.out.println("Number of words: " + count);
	}
}
