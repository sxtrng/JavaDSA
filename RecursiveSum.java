public class RecursiveSum {
    public static void main(String[] args) {

        System.out.println("Summing integers recursively.");
        int value = 5;
        int begin = 0;
        int summation = integerSummation(value);
        System.out.printf("The sum of all the integers between %d and %d is %d.\n", begin, value, summation);

    }

    public static int integerSummation(int number) {

        if (number == 1) {

            return 1;

        }

        return number + (integerSummation(number - 1));

    }

}