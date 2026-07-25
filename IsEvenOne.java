public class IsEvenOne {
	public static void main(String[] args) {

		System.out.println(isEven(2));
		System.out.println(isEven(1));
		
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