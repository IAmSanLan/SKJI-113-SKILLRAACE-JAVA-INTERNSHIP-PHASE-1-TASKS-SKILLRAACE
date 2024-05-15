import java.util.Scanner;

public class ChangeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the change to be given to Pranav:");
        int amount = scanner.nextInt();
        


        int[] notes = {1, 2, 5, 10, 50, 100};
        int[] minNotes = new int[amount + 1];

        for (int i = 0; i <= amount; i++) {
            minNotes[i] = Integer.MAX_VALUE;
        }

        minNotes[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < notes.length; j++) {
                if (i >= notes[j]) {
                    int numNotes = minNotes[i - notes[j]];
                    if (numNotes != Integer.MAX_VALUE && numNotes + 1 < minNotes[i]) {
                        minNotes[i] = numNotes + 1;
                    }
                }
            }
        }
        System.out.println("The smallest number of notes that will combine to give is: " );
        System.out.println(minNotes[amount]);
    }
}
