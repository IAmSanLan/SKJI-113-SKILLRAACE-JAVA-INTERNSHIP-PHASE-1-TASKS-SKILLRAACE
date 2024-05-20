import java.util.Scanner;

public class task2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        long number = scanner.nextLong();
        
        int count = 0;
        
        while (number > 0) {
            long digit = number % 10;
            if (digit == 4) {
                count++;
            }
            number /= 10;
        }
        
        System.out.println("No. of occurance of digit 4 is " + count);
    }
}

