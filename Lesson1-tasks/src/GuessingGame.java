import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let the game begin!");
        System.out.print("Nickname: ");
        String nickname = scanner.nextLine();

        int[] guesses = new int[100];
        int guessCount = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = validScan(scanner);

            guesses[guessCount++] = guess;

            if (guess < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + nickname + "! You won.");
                break;
            }
        }

        System.out.print("Your numbers: ");
        int[] result = Arrays.copyOf(guesses, guessCount);
        Arrays.sort(result);
        for (int i = guessCount - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }
    }

    private static int validScan(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter an integer: ");
            }
        }
    }
}
