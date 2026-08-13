public class LinearSearchZero {
	public static void main(String[] args) {
		
		int[] values = {1, 2, 3, 4, 5};
		int targetValue = 5;
		int index = linearSearch(values, targetValue);

		if (index == -1) {
			System.out.printf("%d was not found%n", targetValue);
		} else {
			System.out.printf("%d was found at index %d%n", targetValue, index);
		}

	}

	public static int linearSearch(int[] elements, int target) {

		int numberOfElements = elements.length;

		for (int i = 0; i < numberOfElements; i++) {

			if (elements[i] == target) {

				return i;

			}

		}

		return -1;

	}

}