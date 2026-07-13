public class MultiplicationTableIterative {
	public static void main(String[] args) {

		int value = 1;
		printMultiples(value);

		System.out.println();

		value = 2;
		printMultiples(value);

	}

	public static void printMultiples(int factor) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d%n", factor, i, (factor * i));
		}
	}

}