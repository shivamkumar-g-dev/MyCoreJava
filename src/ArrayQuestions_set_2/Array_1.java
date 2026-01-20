package ArrayQuestions_set_2;

public class Array_1 {

	public static void printArr(int arr[]) {

		for (int n : arr) {
			System.out.println("for-each : " + n);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 2, 3, 53, 56 };

		printArr(arr);

	}

}