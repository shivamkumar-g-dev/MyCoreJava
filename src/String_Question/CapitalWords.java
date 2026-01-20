package String_Question;

public class CapitalWords  {

	public static void main(String[] args) {

		String str = "Hello hi MY Name Is Shivam";
		int count = 0;

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			String w = words[i];
			char ch = w.charAt(0);
			if (ch >= 'A' && ch <= 'Z') {
				count++;
			}
		}

		System.out.println("Total Capital Words: " + count);
	}
}
