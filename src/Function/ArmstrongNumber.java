package Function;

public class ArmstrongNumber {
	public static int digitcounter(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	public static int power(int n, int p) {
		int pow=1;
		for(int i=1;i<=p;i++) {
			pow=pow*n;
		}
		return pow;
	}
	public static void isArmstrong(int n) {
		int dig=digitcounter(n);
		int sum=0,actualNo=n;
		while(n>0) {
			int rem=n%10;
			sum=sum+power(rem,dig);
			n=n/10;
		}
		if(sum==actualNo) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("No Armstrong Number");
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		isArmstrong(1634);
		// TODO Auto-generated method stub

	}

}