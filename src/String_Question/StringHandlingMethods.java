package String_Question;


public class StringHandlingMethods {

	public static void main(String[] args) {

		String str1 = "Welcome to ducat india";
		String str2 = "Welcome to ducat india";
		String str3 = new String("Welcome to ducat India");
		String str4 = new String("Welcome to ducat india");

		System.out.println("str1.length(): " + str1.length());
		System.out.println("str1.charAt(): " + str1.charAt(0));

		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str3.equals(str4): " + str3.equals(str4));
		System.out.println("str3 == str4: " + (str3 == str4));
		System.out.println("str3.equalsIgnoreCase(str4): " + str3.equalsIgnoreCase(str4));
		System.out.println("str3.substring(11): " + str3.substring(11));
		System.out.println("str3.substring(11,16): " + str3.substring(11, 16));
//
		System.out.println("str4.contains(\"india\"): " + str4.contains("india"));
		System.out.println("str3.startsWith(\"welcome\"): " + str3.startsWith("Welcome"));
		System.out.println("str3.endsWith(\"welcome\"): " + str3.endsWith("ia"));
		System.out.println("str3.toUpperCase(): " + str3.toUpperCase());
		System.out.println("str3.toLowerCase(): " + str3.toLowerCase());

		int n = 333;
		double pi = 3.14;

		System.out.println("String.format(): " + String.format("Welcome %d to ducat %f india", n, pi));
//
		System.out.println("Welcome" + n + " to ducat " + pi + " india");

	}

}
