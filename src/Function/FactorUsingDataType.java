package Function;

public class FactorUsingDataType {

	public static void factor(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		int a=6; int b=20;
		factor(b);
	}
}