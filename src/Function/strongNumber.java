package Function;

public class strongNumber {
	
    public static void isStrong(int n){
        int temp = n, sum = 0;

        while(temp > 0){
            int digit = temp % 10;
            
            int fact = 1;      // factorial of each digit
            for(int i=1; i<=digit; i++){
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if(sum == n) {
            System.out.println(n + " is a Strong Number");
        }else {
            System.out.println(n + " is NOT a Strong Number");
        }
    }

    public static void main(String[] args) {
        isStrong(145);
        isStrong(123);
    }
}