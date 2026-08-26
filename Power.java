public class Power {
    public static void main(String[] args) {

        double base;
        int exponent;
        double power;

        base = 2;
        exponent = 3;
        power = powerOne(base, exponent);
        System.out.printf("%.1f^%d = %.1f%n", base, exponent, power);

        base = -2;
        exponent = -3;
        power = powerTwo(base, exponent);
        System.out.printf("%.1f^%d = %.3f%n", base, exponent, power);

        base = 2;
        exponent = -4;
        power = powerThree(base, exponent);
        System.out.printf("%.1f^%d = %.3f%n", base, exponent, power);

        base = -2;
        exponent = 3;
        power = powerFour(base, exponent);
        System.out.printf("%.1f^%d = %.1f%n", base, exponent, power);

    }

    public static double powerOne(double base, int exponent) {
        double pow = 1;

        for (int i = 0; i < Math.abs(exponent); i++) {
            pow *= base;
        }
        if (exponent < 0) {
            return 1 / pow;
        }
        return pow;
    }

    public static double powerTwo(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1 / powerTwo(base, -exponent);
        }
        return base * powerTwo(base, exponent - 1);
    }

    public static double powerThree(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1 / powerThree(base, -exponent);
        }
        double temp = powerThree(base, exponent / 2);
        if (exponent % 2 == 0) {
            return temp * temp;
        } else {
            return base * Math.pow(temp, 2);
        }
    }

    public static double powerFour(double b, int e) {
        return Math.pow(b, e);
    }

}