import java.util.Scanner;

public class task2a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        long n = scanner.nextLong();
        long sumOfOddDigits = 0;
        long sumOfEvenDigits = 0;
        long num = n;

        while (num > 0) {
            long lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                sumOfEvenDigits += lastDigit;
            } else {
                sumOfOddDigits += lastDigit;
            }
            num /= 10;
        }

        System.out.println("Odd digits sum: " + sumOfOddDigits);
        System.out.println("Even digits sum: " + sumOfEvenDigits);
    }
}