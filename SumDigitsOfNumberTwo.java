public class SumDigitsOfNumberTwo {
    public static void main(String[] args) {

        int values = 1234;

        System.out.println(sumDigits(values));

    }

    

    public static int sumDigits(int number) {
        
        String s = Integer.toString(number);
        int sum = 0;

        for (char ch : s.toCharArray()) {
            sum += ch - '0';
        }
        return sum;
    }
    
}
