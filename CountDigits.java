import java.lang.Math;

public class CountDigits {
	public static void main(String[] args) {
		

		System.out.printf("%d%n", countDigitsOne(1234));
		System.out.printf("%d%n", countDigitsTwo(1234));
		System.out.printf("%d%n", countDigitsThree(1234));
		System.out.printf("%d%n", countDigitsFour(1234));


		System.out.printf("%d%n", countDigitsOne(-1234));
		System.out.printf("%d%n", countDigitsTwo(-1234));
		System.out.printf("%d%n", countDigitsThree(-1234));
		System.out.printf("%d%n", countDigitsFour(-1234));


	}



	public static int countDigitsOne(int number) {

		if (number == 0) {
			return 1;
		}

		int count = 0;

		while (number != 0) {

			number /= 10;

			++count;

		}

		return count;

	}



	public static int countDigitsTwo(int number) {

		if ((number / 10) == 0) {

			return 1;

		}

		return 1 + countDigitsTwo(number / 10);

	}



	public static int countDigitsThree(int number) {

		if (number == 0) {

			return 1;

		}

		number = Math.abs(number);

		return (int)(Math.floor(Math.log10(number))) + 1;

	}



	public static int countDigitsFour(int number) {

		String asWord = Integer.toString(number);

		if (asWord.charAt(0) == '-') {
		
			return asWord.length() - 1;
		
		}

		return asWord.length();

	}

}