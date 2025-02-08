import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] schedule = {
                {"Sunday", "do homework"},
                {"Monday", "go to courses; watch a film"},
                {"Tuesday", "take the dog for a walk"},
                {"Wednesday", "hack into NASA's system"},
                {"Thursday", "watch some science videos"},
                {"Friday", "reach 2500 elo in chess"},
                {"Saturday", "play football for 2 hours"}
        };

        while (true) {
            System.out.println("Please, input the day of the week:");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            }

            if (input.startsWith("change ")) {
                String dayToChange = input.substring(7).trim();
                int dayIndex = getWeekDayIndex(dayToChange, schedule);
                if (dayIndex != -1) {
                    System.out.println("Please, input new tasks for " + schedule[dayIndex][0] + ":");
                    schedule[dayIndex][1] = scanner.nextLine().trim();
                } else {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
                continue;
            }

            int dayIndex = getWeekDayIndex(input, schedule);
            if (dayIndex != -1) {
                System.out.println("Your tasks for " + schedule[dayIndex][0] + ": " + schedule[dayIndex][1] + ".");
            } else {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }

        scanner.close();
    }

    private static int getWeekDayIndex(String day, String[][] schedule) {
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][0].equalsIgnoreCase(day)) {
                return i;
            }
        }
        return -1;
    }
}