package Function;

public class palindromeNumber {
	public static void palindrome(int num) {
		int temp=0;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
			if(temp==num) {
				System.out.println("Palindrome Number");
			}else {
				System.out.println("Not Palindrome Number");
			}
		}
	}

	public static void main(String[] args) {
		int a=121; int b=421;
		palindrome(a);
	//	palindrome(b);
		//palindrome(121);
	//	palindrome(435);
		// TODO Auto-generated method stub

	}

}
