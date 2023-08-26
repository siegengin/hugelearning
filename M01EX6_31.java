import java.util.Scanner;

public class M01EX6_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long creditCardNumber = scanner.nextLong();

        if (isValid(creditCardNumber)) {
            System.out.println(creditCardNumber + " is valid");
        } else {
            System.out.println(creditCardNumber + " is invalid");
        }
    }

    public static boolean isValid(long number) {
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (total % 10 == 0) && prefixMatched(number, 1);
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);

        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Integer.parseInt(Character.toString(numStr.charAt(i)));
            sum += getDigit(digit * 2);
        }

        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return (number % 10) + (number / 10);
        }
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);

        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(Character.toString(numStr.charAt(i)));
        }

        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) <= k) {
            return number;
        } else {
            String numStr = Long.toString(number);
            return Long.parseLong(numStr.substring(0, k));
        }
    }
}
