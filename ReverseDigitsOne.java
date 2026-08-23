public class ReverseDigitsOne {
	public static void main(String[] args) {

		int value = 123;
		System.out.println(value);
		System.out.println(reverseDigits(value));
		
	}

	public static int reverseDigits(int number) {

		int reversedNumber = 0;
		while (number > 0) {
			reversedNumber = reversedNumber * 10 + number % 10;
			number = number / 10;
		}
		return reversedNumber;
	}

}