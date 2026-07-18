public class SwapTwoIntegersThree {
    public static void main(String[] args) {
        int valueOne = 10;
        int valueTwo = 20;

        System.out.printf("%d, %d%n", valueOne, valueTwo);

        valueOne = valueOne ^ valueTwo;
        valueTwo = valueOne ^ valueTwo;
        valueOne = valueOne ^ valueTwo;

        System.out.printf("%d, %d%n", valueOne, valueTwo);

    }
}