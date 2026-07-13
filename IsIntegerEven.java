public class IsIntegerEven {
	public static void main(String[] args) {

		int value = 100;

		System.out.printf("Value: %d%n", value);

		if (isEven(value)) {
			System.out.printf("%d is even%n", value);
		} else {
			System.out.printf("%d is odd%n", value);
		}



		value = 99;

		System.out.printf("Value: %d%n", value);

		if (isEven(value)) {
			System.out.printf("%d is even%n", value);
		} else {
			System.out.printf("%d is odd%n", value);
		}

		
	}

	public static boolean isEven(int number) {

		int remainder = number % 2;

		if (remainder == 0) {
			return true;
		} else {
			return false;
		}
	}

}