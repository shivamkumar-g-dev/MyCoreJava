package Function;

public class maximumNumber {
	public static void max(int a, int b, int c, int d) {
		if(a>=b && a>=c && a>=d) {
			System.out.println("a is maximum number");
		}else if(b>=a && b>=c && b>=d) {
			System.out.println("b is maximum number");
		}else if(c>=a && c>=b && c>=d) {
			System.out.println("c is maximum number");
		}else if(d>=a && d>=b && d>=c) {
			System.out.println("d is maximum number");
		}else {
			System.out.println("Both are Equal number");
		}
	}

	public static void main(String[] args) {
		int a=45; int b=34; int c=987; int d=23;
		max(a,b,c,d);
		// TODO Auto-generated method stub

	}

}