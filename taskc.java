import java.util.Scanner;

public class taskc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        String userInput;  // Variable to store user input

        System.out.println("Hello! I am your cute little simple chatbot.");
        System.out.println("Type 'end' to end the conversation.");

        // Infinite loop for continuous conversation
        while (true) {
            System.out.print("> ");  // Prompt user for input
            userInput = scanner.nextLine();  // Read user input

            // Convert user input to lowercase to make it case-insensitive
            userInput = userInput.toLowerCase();

            // Check user input and respond accordingly
            if (userInput.equals("hi") || userInput.equals("hello")) {
                System.out.println("Hello, tell me how can I assist you?");
            } else if (userInput.equals("how are you")) {
                System.out.println("I'm fine, ask me a question, I'm here to help you!");
            } else if (userInput.equals("what is your name")) {
                System.out.println("My name is taskc chatbot.");
            } else if (userInput.equals("end")) {
                System.out.println("Goodbye! c u next time.");
                break;  // Exit the loop and end the program
            } else {
                System.out.println("I'm sorry, I don't understand that. Can you ask something else?");
            }
        }

        scanner.close();  // Close the scanner
    }
}
