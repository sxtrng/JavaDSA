public class SumOfSquaresOne {
	public static void main(String[] args) {

		System.out.println(sumOfSquares(3));
		
	}


	public static long sumOfSquares(int number) {

		int summation = 0;

		for (int i = 1; i <= number; i++) {

			summation += Math.pow(i, 2);

		}

		return summation;

	}


}