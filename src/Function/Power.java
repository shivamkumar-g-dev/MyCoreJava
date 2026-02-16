package Function;

public class Power {
	public static void power(int a, int b){
	    int result = 1;
	    for(int i=1; i<=b; i++){
	        result *= a;
	    }
	    System.out.println(a + "^" + b + " = " + result);
	}

	public static void main(String[] args) {
		int a= 4; int b=3;
		power(a,b);
		
		// TODO Auto-generated method stub

	}

}