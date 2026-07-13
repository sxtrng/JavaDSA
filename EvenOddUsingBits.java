public class EvenOddUsingBits {
	public static void main(String[] args) {
		
		int value = 1;

		if (isEven(value)) {
			System.out.printf("%d is even%n", value);
		} else {
			System.out.printf("%d is odd%n", value);
		}


		value = 2;

		if (isEven(value)) {
			System.out.printf("%d is even%n", value);
		} else {
			System.out.printf("%d is odd%n", value);
		}

	}

	public static boolean isEven(int number) {
		if ((number & 1) == 0) {
			return true;
		} else {
			return false;
		}
	}

}