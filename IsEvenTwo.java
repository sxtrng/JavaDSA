public class IsEvenTwo {
	public static void main(String[] args) {

		System.out.println(isEven(1));
		System.out.println(isEven(2));
		
	}


	public static boolean isEven(int number) {

		if ((number & 1) == 0) {
			return true;
		} else {
			return false;
		}

	}


}