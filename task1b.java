import java.util.Scanner;

public class task1b
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of the person:");
        int age = scanner.nextInt();
        
        if (age < 15 || age > 60) {
            System.out.println("Output: Not Allowed");
        } else {
            System.out.println("Output: Allowed");
        }
    }
}
