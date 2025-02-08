import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] field = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '-';
            }
        }

        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            printField(field);

            int row = validScan(scanner, "Enter row (1-5): ") - 1;
            int col = validScan(scanner, "Enter column (1-5): ") - 1;

            if (row == targetRow && col == targetCol) {
                field[row][col] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            } else {
                field[row][col] = '*';
            }
        }
    }

    private static int validScan(Scanner scanner, String message) {
        int num;
        while (true) {
            System.out.print(message);
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num >= 1 && num <= 5) {
                    return num;
                }
            } catch (NumberFormatException ignored) {}
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
    }

    private static void printField(char[][] field) {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
