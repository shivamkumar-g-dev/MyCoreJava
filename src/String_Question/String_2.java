package String_Question;



public class String_2 {

	public static void main(String[] args) {

//		By Using Literals--> (HEAP --> SCP(String Constant Pool))
		String str1 = "hello Hi what's up";
		String str4 = "hello Hi what's up";
		
//		By Using new Keyword --> (HEAP)
		String str2 = new String("hello Hi what's up");
		String str5 = new String("hello Hi what's up");
		
//		By Using char Array
		char chArr[] = {'A','B','H','I'};
		String str3 = new String(chArr);

		System.out.println(str1.concat(" Java Geeks"));
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str2);
		System.out.println(str5);
		
		System.out.println(str1 == str4);
		System.out.println(str2 == str5);
		
	
	}

}