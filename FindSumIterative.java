public class FindSumIterative {
	public static void main(String[] args) {

		int value = 5;

		System.out.printf("sum: %d\n", findSum(value));

	}

	public static int findSum(int number) {

		int sum = 0;

		for (int i = 1; i <= number; i++) {

			sum += i;

		}

		return sum;
	}

}