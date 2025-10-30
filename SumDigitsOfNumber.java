/*
    method explanation:

        1.  int sum = 0;
                The sum of the individual digits will equal this number.
                It is set to zero to begin because we begin counting from zero.

        2.  while (number != 0){}
                In order to sum the individual digits, we must iterate through each digit.
                Do this until the number is zero.

        3.  int lastDigit = number % 10;
                number % 10 will always yield the last digit of the number.

        4.  sum += lastDigit;
                Takes the last digit obtained from the previous step and adds it to sum.

        5.  number /= 10;
                Divides the number by ten.  Because we are using integer division,
                any remainders are truncated, and thus never displayed.  This incrementally
                reduces the magnitude of the number until it is equal to zero.

        6.  return sum;
                Giving the number back to the caller to be displayed.


 */

public class SumDigitsOfNumber {
    public static void main(String[] args) {

        int values = 1234;
        // System.out.println(values % 10);
        // System.out.println(values /= 10);
        int total = sumDigits(values);
        System.out.println(total);

    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }
}
