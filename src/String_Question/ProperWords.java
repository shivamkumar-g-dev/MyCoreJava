package String_Question;

public class ProperWords {

	public static void main(String[] args) {

		String str = "Hello My name is Shivam What Are You doing today";
		int count = 0;

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			String w = words[i];
			if (w.length() > 0 && Character.isUpperCase(w.charAt(0))) {
				count++;
			}
		}

		System.out.println("Total proper words: " + count);
	}
}
