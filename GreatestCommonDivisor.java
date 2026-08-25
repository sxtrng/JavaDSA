//import java.util.*;
//import java.io.*;

public class GreatestCommonDivisor {
	public static void main(String[] args) {

		int a = 16;
		int b = 24;
		int c = gcd1(a, b);
		System.out.printf("GCD of %d and %d is %d%n", a, b, c);

		a = 32;
		b = 24;
		c = gcd2(a, b);
		System.out.printf("GCD of %d and %d is %d%n", a, b, c);

		a = 96;
		b = 64;
		c = gcd3(a, b);
		System.out.printf("GCD of %d and %d is %d%n", a, b, c);

		
	}


	static int gcd1(int a, int b) {
		if (a == 0 || b == 0) {
			return Math.max(a, b);
		}
		int result = Math.min(a, b);
		while (result > 0) {
			if (a % result == 0 && b % result == 0) {
				break;
			}
			result--;
		}
		return result;
	}


	public static int gcd2(int a, int b) {

		if (a == 0) {
			return b;
		}

		if (b == 0) {
			return a;
		}

		if (a == b) {
			return a;
		}

		if (a > b) {
			if (a % b == 0) {
				return b;
			}
			return gcd2(a-b, b);
		}

		if (b % a == 0) {
			return a;
		}
		return gcd2(a, b - a);

	}

	public static int gcd3(int a, int b) {
		return (b == 0) ? a : gcd3(b, a % b);
	}


}