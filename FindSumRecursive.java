public class FindSumRecursive {
	public static void main(String[] args) {

		int value = 0;
		int summation = sumOfIntegers(value);
		System.out.printf("Sum of %d = %d\n", value, summation);

		value = 1;
		summation = sumOfIntegers(value);
		System.out.printf("Sum of %d = %d\n", value, summation);

		value = 2;
		summation = sumOfIntegers(value);
		System.out.printf("Sum of %d = %d\n", value, summation);

		value = 3;
		summation = sumOfIntegers(value);
		System.out.printf("Sum of %d = %d\n", value, summation);

		value = 4;
		summation = sumOfIntegers(value);
		System.out.printf("Sum of %d = %d\n", value, summation);

		value = 5;
		summation = sumOfIntegers(value);
		System.out.printf("Sum of %d = %d\n", value, summation);

		
	}


	static int sumOfIntegers(int number) {

		if (number == 0) {
			return 0;
		}

		if (number == 1) {

			return 1;

		}

		return number + sumOfIntegers(number - 1);

	}


}