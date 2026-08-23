public class SumOfSquaresTwo {
	public static void main(String[] args) {

		System.out.println(sumOfSquares(3));
		
	}


	public static long sumOfSquares(int number) {

		return (number * (number + 1) * (2 * number + 1)) / 6;

	}


}