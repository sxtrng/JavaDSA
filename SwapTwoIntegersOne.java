public class SwapTwoIntegersOne {

	public static void main(String[] args) {
		
		int valueOne = 10;
		int valueTwo = 20;

		System.out.printf("%d, %d%n", valueOne, valueTwo);

		int temporary = valueOne;
		valueOne = valueTwo;
		valueTwo = temporary;

		System.out.printf("%d, %d%n", valueOne, valueTwo);

	}


}